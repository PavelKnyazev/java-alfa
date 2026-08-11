package main.lesson15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RentalCostTest {

    private GameRental rental;
    private BoardGame game;

    @BeforeEach
    public void setUp() {
        rental = new GameRental();
        game = new BoardGame("Catan", 10, 500);
    }

    @Test
    public void shouldCalculateRentalCost() {
        rental.addGame(game);

        assertEquals(1500, rental.calculateCost("Catan", 3));
    }

    @Test
    public void shouldThrowExceptionWhenCalculatingCostForUnknownGame() {
        assertThrows(
                IllegalArgumentException.class,
                () -> rental.calculateCost("Monopoly", 3)
        );
    }

    @Test
    public void shouldThrowExceptionWhenDaysIsZero() {
        rental.addGame(game);

        assertThrows(
                IllegalArgumentException.class,
                () -> rental.calculateCost("Catan", 0)
        );
    }

    @Test
    public void shouldThrowExceptionWhenDaysIsNegative() {
        rental.addGame(game);

        assertThrows(
                IllegalArgumentException.class,
                () -> rental.calculateCost("Catan", -1)
        );
    }


    static Stream<Integer> rentalDays() {
        return Stream.of(1, 2, 3, 5);
    }

    @ParameterizedTest
    @MethodSource("rentalDays")
    public void shouldCalculateCostForDifferentDays(int days) {
        rental.addGame(game);

        int expected = 500 * days;

        assertEquals(expected, rental.calculateCost("Catan", days));
    }

}
