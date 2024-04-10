/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void testConstructors() {
        Circle circle = new Circle();
        assertEquals("Circle constructor sets X incorrectly", 0, circle.getX(), 0);
        assertEquals("Circle constructor sets Y incorrectly", 0, circle.getY(), 0);
        assertEquals("Circle constructor sets sideLength incorrectly", 0, circle.getRadius(), 0);

        circle = new Circle(10, 20);
        assertEquals("Circle constructor sets X incorrectly", 10, circle.getX(), 0);
        assertEquals("Circle constructor sets Y incorrectly", 20, circle.getY(), 0);
        assertEquals("Circle constructor sets sideLength incorrectly", 0, circle.getRadius(), 0);

        circle = new Circle(10, 20, 30);
        assertEquals("Circle constructor sets X incorrectly", 10, circle.getX(), 0);
        assertEquals("Circle constructor sets Y incorrectly", 20, circle.getY(), 0);
        assertEquals("Circle constructor sets sideLength incorrectly", 30, circle.getRadius(), 0);
    }

    @Test
    public void testGettersSetters(){
        Circle circle = new Circle();
        circle.setX(5);
        circle.setY(10);
        circle.setRadius(15);

        assertEquals("X value is incorrect", 5, circle.getX(), 0);
        assertEquals("Y value is incorrect", 10, circle.getY(), 0);
        assertEquals("Side length is incorrect", 15, circle.getRadius(), 0);
    }

    @Test
    public void testArea(){
        Circle circle = new Circle();
        circle.setRadius(5);
        assertEquals("Area is incorrect", Math.PI * 5 * 5, circle.getArea(), 0);
    }

    @Test
    public void testToString(){
        Circle circle = new Circle();
        assertEquals("Circle toString is incorrect", "O", circle.toString());
    }

    @Test
    public void testDraw(){
        Circle circle = new Circle();

        // Redirect System.out to a buffer
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        circle.draw();

        String expectedOutput = "O";

        // Remove new line characters
        String actualOutput = outContent.toString().replace("\n", "").replace("\r", "");

        assertEquals(
            String.format(
                "Report method in Circle class is not functioning correctly. Expected: '%s', but was: '%s'",
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
