/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquareTest {

    @Test
    public void testConstructors() {
        Square square = new Square();
        assertEquals("Square constructor sets X incorrectly", 0, square.getX(), 0);
        assertEquals("Square constructor sets Y incorrectly", 0, square.getY(), 0);
        assertEquals("Square constructor sets sideLength incorrectly", 0, square.getSideLength(), 0);

        square = new Square(10, 20);
        assertEquals("Square constructor sets X incorrectly", 10, square.getX(), 0);
        assertEquals("Square constructor sets Y incorrectly", 20, square.getY(), 0);
        assertEquals("Square constructor sets sideLength incorrectly", 0, square.getSideLength(), 0);

        square = new Square(10, 20, 30);
        assertEquals("Square constructor sets X incorrectly", 10, square.getX(), 0);
        assertEquals("Square constructor sets Y incorrectly", 20, square.getY(), 0);
        assertEquals("Square constructor sets sideLength incorrectly", 30, square.getSideLength(), 0);
    }

    @Test
    public void testGettersSetters(){
        Square square = new Square();
        square.setX(5);
        square.setY(10);
        square.setSideLength(15);

        assertEquals("X value is incorrect", 5, square.getX(), 0);
        assertEquals("Y value is incorrect", 10, square.getY(), 0);
        assertEquals("Side length is incorrect", 15, square.getSideLength(), 0);
    }

    @Test
    public void testArea(){
        Square square = new Square();
        square.setSideLength(5);
        assertEquals("Area is incorrect", 25, square.getArea(), 0);
    }

    @Test
    public void testToString(){
        Square square = new Square();
        assertEquals("Square toString is incorrect", "[]", square.toString());
    }

    @Test
    public void testDraw(){
        Square square = new Square();

        // Redirect System.out to a buffer
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        square.draw();

        String expectedOutput = "[]";

        // Remove new line characters
        String actualOutput = outContent.toString().replace("\n", "").replace("\r", "");

        assertEquals(
            String.format(
                "Report method in Square class is not functioning correctly. Expected: '%s', but was: '%s'",
                expectedOutput,
                actualOutput
            ),
            expectedOutput,
            actualOutput
        );

        // Reset System.out
        System.setOut(System.out);
    }
}
