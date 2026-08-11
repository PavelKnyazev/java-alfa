package main.lesson15;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoardGameTest {

    @ParameterizedTest
    @CsvSource({
            "9, false",
            "10, true",
            "11, true",
            "18, true"
    })
    public void shouldCheckRentalByAge(int age, boolean expected) {
        BoardGame game = new BoardGame("Catan", 10, 500);

        assertEquals(expected, game.canBeRentedBy(age));
    }

    @Test
    public void shouldCreateBoardGame() {
        BoardGame game = new BoardGame("Catan", 10, 500);
        assertEquals("Catan", game.getName());
        assertEquals(10, game.getMinAge());
        assertEquals(500, game.getRentalPrice());
        assertEquals(false, game.isRented());
    }

    @Test
    public void shouldAllowRentalForOldEnoughCustomer() {
        BoardGame game = new BoardGame("Catan", 10, 500);
        assertEquals(true, game.canBeRentedBy(10));
    }

    @Test
    public void shouldNotAllowRentalForTooYoungCustomer() {
        BoardGame game = new BoardGame("Catan", 10, 500);
        assertEquals(false, game.canBeRentedBy(9));
    }

    @Test
    public void shouldThrowExceptionWhenNameIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new BoardGame(null, 10, 500));
    }

    @Test
    public void shouldThrowExceptionWhenNameIsEmpty() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new BoardGame("", 10, 500)
        );
    }

    @Test
    public void shouldThrowExceptionWhenMinAgeIsNegative() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new BoardGame("Catan", -1, 500)
        );
    }

    @Test
    public void shouldThrowExceptionWhenRentalPriceIsZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new BoardGame("Catan", 10, 0)
        );
    }

    @Test
    public void shouldThrowExceptionWhenRentalPriceIsNegative() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new BoardGame("Catan", 10, -100)
        );
    }

}
