/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Assume;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class CircleTest {


//    @Test
//    public void checkForSetRadius() {
//        boolean methodExists = false;
//        try {
////            Circle circle = new Circle();
////            circle.setRadius(0);
//            Method method = Circle.class.getMethod("setRadius", double.class);
//            methodExists = true;
//        }
//        catch(NoSuchMethodException e){
//            fail("No setRadius method in Circle class");
//        }
//
//        Assume.assumeTrue(methodExists);
//
//        Circle circle = new Circle();
//        circle.setRadius();
//
//    }

    @Test
    public void testGetSetX(){
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor();
            Object circle = constructor.newInstance();

            Method setRadiusMethod = circleClass.getMethod("setX", double.class);
            setRadiusMethod.invoke(circle, 10.0);

            Method getRadiusMethod = circleClass.getMethod("getX");
            double x = (Double) getRadiusMethod.invoke(circle);

            assertEquals("setX method did not set the radius correctly.", 10.0, x, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: x getter and/or setter missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: x getter and/or setter missing from Circle class");
        }
        catch(Exception e){
            fail("testGetSetX failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetSetY(){
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor();
            Object circle = constructor.newInstance();

            Method setRadiusMethod = circleClass.getMethod("setY", double.class);
            setRadiusMethod.invoke(circle, 10.0);

            Method getRadiusMethod = circleClass.getMethod("getY");
            double y = (Double) getRadiusMethod.invoke(circle);

            assertEquals("setY method did not set the radius correctly.", 10.0, y, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: y getter and/or setter missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: y getter and/or setter missing from Circle class");
        }
        catch(Exception e){
            fail("testGetSetY failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetSetRadius(){
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor();
            Object circle = constructor.newInstance();

            Method setRadiusMethod = circleClass.getMethod("setRadius", double.class);
            setRadiusMethod.invoke(circle, 10.0);

            Method getRadiusMethod = circleClass.getMethod("getRadius");
            double radius = (Double) getRadiusMethod.invoke(circle);

            assertEquals("setRadius method did not set the radius correctly.", 10.0, radius, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: radius getter and/or setter missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: radius getter and/or setter missing from Circle class");
        }
        catch(Exception e){
            fail("testSetRadius failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testConstructors(){
        // Check for default constructor
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor();
            Object circle = constructor.newInstance();

            Method setRadiusMethod = circleClass.getMethod("setX", double.class);
            setRadiusMethod.invoke(circle, 10.0);

            setRadiusMethod = circleClass.getMethod("setY", double.class);
            setRadiusMethod.invoke(circle, 20.0);

            setRadiusMethod = circleClass.getMethod("setRadius", double.class);
            setRadiusMethod.invoke(circle, 30.0);

            Method getRadiusMethod = circleClass.getMethod("getX");
            double x = (Double) getRadiusMethod.invoke(circle);

            getRadiusMethod = circleClass.getMethod("getY");
            double y = (Double) getRadiusMethod.invoke(circle);

            getRadiusMethod = circleClass.getMethod("getRadius");
            double radius = (Double) getRadiusMethod.invoke(circle);

            assertEquals("X value is incorrect", 10.0, x, 0);
            assertEquals("Y value is incorrect", 20.0, y, 0);
            assertEquals("Radius value is incorrect", 30.0, radius, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: constructor missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: constructor missing from Circle class");
        }
        catch(Exception e){
            fail("testConstructors failed due to an unexpected exception: " + e.getMessage());
        }

        // Check for constructor with x and y
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor(double.class, double.class);
            Object circle = constructor.newInstance(10.0, 20.0);

            Method setRadiusMethod = circleClass.getMethod("setRadius", double.class);
            setRadiusMethod.invoke(circle, 30.0);

            Method getRadiusMethod = circleClass.getMethod("getX");
            double x = (Double) getRadiusMethod.invoke(circle);

            getRadiusMethod = circleClass.getMethod("getY");
            double y = (Double) getRadiusMethod.invoke(circle);

            getRadiusMethod = circleClass.getMethod("getRadius");
            double radius = (Double) getRadiusMethod.invoke(circle);

            assertEquals("X value is incorrect", 10.0, x, 0);
            assertEquals("Y value is incorrect", 20.0, y, 0);
            assertEquals("Radius value is incorrect", 30.0, radius, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: constructor missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: constructor missing from Circle class");
        }
        catch(Exception e){
            fail("testConstructors failed due to an unexpected exception: " + e.getMessage());
        }

        // Check for constructor with x, y, and radius
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor(double.class, double.class, double.class);
            Object circle = constructor.newInstance(10.0, 20.0, 30.0);

            Method getRadiusMethod = circleClass.getMethod("getX");
            double x = (Double) getRadiusMethod.invoke(circle);

            getRadiusMethod = circleClass.getMethod("getY");
            double y = (Double) getRadiusMethod.invoke(circle);

            getRadiusMethod = circleClass.getMethod("getRadius");
            double radius = (Double) getRadiusMethod.invoke(circle);

            assertEquals("X value is incorrect", 10.0, x, 0);
            assertEquals("Y value is incorrect", 20.0, y, 0);
            assertEquals("Radius value is incorrect", 30.0, radius, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: constructor missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: constructor missing from Circle class");
        }
        catch(Exception e){
            fail("testConstructors failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testArea(){
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor();
            Object circle = constructor.newInstance();

            Method setRadiusMethod = circleClass.getMethod("setRadius", double.class);
            setRadiusMethod.invoke(circle, 5.0);

            Method getAreaMethod = circleClass.getMethod("getArea");
            double area = (Double) getAreaMethod.invoke(circle);

            assertEquals("Area is incorrect", Math.PI * 5 * 5, area, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: getArea method missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: getArea method missing from Circle class");
        }
        catch(Exception e){
            fail("testArea failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testToString(){
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor();
            Object circle = constructor.newInstance();

            Method setRadiusMethod = circleClass.getMethod("setRadius", double.class);
            setRadiusMethod.invoke(circle, 5.0);

            Method toStringMethod = circleClass.getMethod("toString");
            String output = (String) toStringMethod.invoke(circle);

            assertEquals("toString is incorrect", "O", output);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: toString method missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: toString method missing from Circle class");
        }
        catch(Exception e){
            fail("testToString failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testDraw(){
        try {
            Class<?> circleClass = Class.forName("Circle");
            Constructor<?> constructor = circleClass.getConstructor();
            Object circle = constructor.newInstance();

            // Redirect System.out to a buffer
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            Method drawMethod = circleClass.getMethod("draw");
            drawMethod.invoke(circle);

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
        catch (ClassNotFoundException e){
            fail("MISSING: draw method missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: draw method missing from Circle class");
        }
        catch(Exception e){
            fail("testDraw failed due to an unexpected exception: " + e.getMessage());
        }
    }

    // @Test
    // public void testConstructors() {
    //     Circle circle = new Circle();
    //     assertEquals("Circle constructor sets X incorrectly", 0, circle.getX(), 0);
    //     assertEquals("Circle constructor sets Y incorrectly", 0, circle.getY(), 0);
    //     assertEquals("Circle constructor sets sideLength incorrectly", 0, circle.getRadius(), 0);

    //     circle = new Circle(10, 20);
    //     assertEquals("Circle constructor sets X incorrectly", 10, circle.getX(), 0);
    //     assertEquals("Circle constructor sets Y incorrectly", 20, circle.getY(), 0);
    //     assertEquals("Circle constructor sets sideLength incorrectly", 0, circle.getRadius(), 0);

    //     circle = new Circle(10, 20, 30);
    //     assertEquals("Circle constructor sets X incorrectly", 10, circle.getX(), 0);
    //     assertEquals("Circle constructor sets Y incorrectly", 20, circle.getY(), 0);
    //     assertEquals("Circle constructor sets sideLength incorrectly", 30, circle.getRadius(), 0);
    // }

    // @Test
    // public void testGettersSetters(){
    //     Circle circle = new Circle();
    //     circle.setX(5);
    //     circle.setY(10);
    //     //circle.setRadius(15);

    //     assertEquals("X value is incorrect", 5, circle.getX(), 0);
    //     assertEquals("Y value is incorrect", 10, circle.getY(), 0);
    //     assertEquals("Side length is incorrect", 15, circle.getRadius(), 0);
    // }

    // @Test
    // public void testArea(){
    //     Circle circle = new Circle();
    //     //circle.setRadius(5);
    //     assertEquals("Area is incorrect", Math.PI * 5 * 5, circle.getArea(), 0);
    //     fail("Exception thrown when testing Circle getters and setters");
    // }

    // @Test
    // public void testToString(){
    //     Circle circle = new Circle();
    //     assertEquals("Circle toString is incorrect", "O", circle.toString());
    // }

    // @Test
    // public void testDraw(){
    //     Circle circle = new Circle();

    //     // Redirect System.out to a buffer
    //     ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    //     System.setOut(new PrintStream(outContent));

    //     circle.draw();

    //     String expectedOutput = "O";

    //     // Remove new line characters
    //     String actualOutput = outContent.toString().replace("\n", "").replace("\r", "");

    //     assertEquals(
    //         String.format(
    //             "Report method in Circle class is not functioning correctly. Expected: '%s', but was: '%s'",
    //             expectedOutput,
    //             actualOutput
    //         ),
    //         expectedOutput,
    //         actualOutput
    //     );

    //     // Reset System.out
    //     System.setOut(System.out);
    // }
}
