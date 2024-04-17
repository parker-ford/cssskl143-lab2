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

            assertEquals("-CIRCLE CLASS: setX method did not set the radius correctly.", 10.0, x, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -CIRCLE CLASS: x getter and/or setter missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: x getter and/or setter missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testGetSetX failed due to an unexpected exception: " + e.getMessage());
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

            assertEquals("-CIRCLE CLASS: setY method did not set the radius correctly.", 10.0, y, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -CIRCLE CLASS: y getter and/or setter missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: y getter and/or setter missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testGetSetY failed due to an unexpected exception: " + e.getMessage());
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

            assertEquals("-CIRCLE CLASS: setRadius method did not set the radius correctly.", 10.0, radius, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -CIRCLE CLASS: radius getter and/or setter missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: radius getter and/or setter missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testSetRadius failed due to an unexpected exception: " + e.getMessage());
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

            assertEquals("-CIRCLE CLASS: X value is incorrect", 10.0, x, 0);
            assertEquals("-CIRCLE CLASS: Y value is incorrect", 20.0, y, 0);
            assertEquals("-CIRCLE CLASS: Radius value is incorrect", 30.0, radius, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -CIRCLE CLASS: constructor missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: constructor missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testConstructors failed due to an unexpected exception: " + e.getMessage());
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

            assertEquals("-CIRCLE CLASS: X value is incorrect", 10.0, x, 0);
            assertEquals("-CIRCLE CLASS: Y value is incorrect", 20.0, y, 0);
            assertEquals("-CIRCLE CLASS: Radius value is incorrect", 30.0, radius, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -CIRCLE CLASS: constructor missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: constructor missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testConstructors failed due to an unexpected exception: " + e.getMessage());
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

            assertEquals("-CIRCLE CLASS: X value is incorrect", 10.0, x, 0);
            assertEquals("-CIRCLE CLASS: Y value is incorrect", 20.0, y, 0);
            assertEquals("-CIRCLE CLASS: Radius value is incorrect", 30.0, radius, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -CIRCLE CLASS: constructor missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: constructor missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testConstructors failed due to an unexpected exception: " + e.getMessage());
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

            assertEquals("-CIRCLE CLASS: Area is incorrect", Math.PI * 5 * 5, area, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -CIRCLE CLASS: getArea method missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: getArea method missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testArea failed due to an unexpected exception: " + e.getMessage());
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

            assertEquals("-CIRCLE CLASS: toString is incorrect", "O", output);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -CIRCLE CLASS: toString method missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: toString method missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testToString failed due to an unexpected exception: " + e.getMessage());
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
            fail("MISSING: -CIRCLE CLASS: draw method missing from Circle class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -CIRCLE CLASS: draw method missing from Circle class");
        }
        catch(Exception e){
            fail("-CIRCLE CLASS: testDraw failed due to an unexpected exception: " + e.getMessage());
        }
    }

}
