package main.lesson14;

import main.lesson14.task2.XMLUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XMLUtilsTest {

    @Test
    public void shouldCreateEmptyElement() {

        //Arrange
        String tagName = "user";
        String expected = "<user></user>";

        //Act
        String actual = XMLUtils.createEmptyElement(tagName);

        //Assert
        assertEquals(
                expected,
                actual,
                "Неверно создан XML элемент"
        );

    }

    @Test
    public void shouldReturnInvalidForEmptyString() {

        // Arrange
        String tagName = "";
        String expected = "<invalid/>";

        // Act
        String actual = XMLUtils.createEmptyElement(tagName);

        // Assert
        assertEquals(
                expected,
                actual,
                "При пустой строке метод должен вернуть <invalid/>"
        );

    }


}
