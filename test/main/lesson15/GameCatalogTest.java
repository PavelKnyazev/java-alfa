package main.lesson15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameCatalogTest {

    private GameRental rental;
    private BoardGame game;

    @BeforeEach
    public void setUp() {
        rental = new GameRental();
        game = new BoardGame("Catan", 10, 500);
    }

    @Test
    public void shouldAddAndFindGame() {
        rental.addGame(game);

        assertEquals(game, rental.findGame("Catan"));
    }


    @Test
    public void shouldReturnNullWhenGameNotFound() {
        assertEquals(null, rental.findGame("Monopoly"));
    }

    @Test
    public void shouldThrowExceptionWhenAddingNullGame() {
        assertThrows(
                IllegalArgumentException.class,
                () -> rental.addGame(null)
        );
    }

    @Test
    public void shouldThrowExceptionWhenAddingDuplicateGame() {
        BoardGame firstGame = new BoardGame("Catan", 10, 500);
        BoardGame secondGame = new BoardGame("Catan", 12, 700);

        rental.addGame(firstGame);

        assertThrows(
                IllegalArgumentException.class,
                () -> rental.addGame(secondGame)
        );
    }

}
