package main.lesson15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class GameRentalTest {

    private GameRental rental;
    private BoardGame game;

    @BeforeEach
    public void setUp() {
        rental = new GameRental();
        game = new BoardGame("Catan", 10, 500);
    }


    @Test
    public void shouldRentAvailableGameForOldEnoughCustomer() {
        rental.addGame(game);

        assertEquals(true, rental.rentGame("Catan", 10));
    }

    @Test
    public void shouldMarkGameAsRentedAfterSuccessfulRental() {
        rental.addGame(game);
        rental.rentGame("Catan", 10);

        assertEquals(true, game.isRented());
    }

    @Test
    public void shouldNotRentAlreadyRentedGame() {
        rental.addGame(game);
        rental.rentGame("Catan", 10);

        assertEquals(false, rental.rentGame("Catan", 10));
    }

    @Test
    public void shouldThrowExceptionWhenRentingUnknownGame() {
        assertThrows(
                IllegalArgumentException.class,
                () -> rental.rentGame("Monopoly", 20)
        );
    }

    @Test
    public void shouldReturnRentedGame() {
        rental.addGame(game);
        rental.rentGame("Catan", 10);

        assertEquals(true, rental.returnGame("Catan"));
        assertEquals(false, game.isRented());
    }

    @Test
    public void shouldReturnFalseWhenReturningUnknownGame() {
        assertEquals(false, rental.returnGame("Monopoly"));
    }

    @Test
    public void shouldReturnFalseWhenGameWasNotRented() {
        rental.addGame(game);

        assertEquals(false, rental.returnGame("Catan"));
    }

    @Test
    public void shouldResetAllGames() {
        BoardGame firstGame = new BoardGame("Catan", 10, 500);
        BoardGame secondGame = new BoardGame("Monopoly", 8, 300);

        rental.addGame(firstGame);
        rental.addGame(secondGame);

        rental.rentGame("Catan", 10);
        rental.rentGame("Monopoly", 8);

        rental.reset();

        assertEquals(false, firstGame.isRented());
        assertEquals(false, secondGame.isRented());
    }

    @Test
    public void shouldNotRentGameForTooYoungCustomer() {
        rental.addGame(game);

        assertEquals(false, rental.rentGame("Catan", 9));
    }

}
