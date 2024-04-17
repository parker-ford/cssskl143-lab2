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

public class SquareTest {

    @Test
    public void testConstructors() {
        try{
            Class<?> squareClass = Class.forName("Square");
            Constructor<?> constructor = squareClass.getConstructor();
            Object square = constructor.newInstance();

            Method setMethod = squareClass.getMethod("setX", double.class);
            setMethod.invoke(square, 10.0);

            setMethod = squareClass.getMethod("setY", double.class);
            setMethod.invoke(square, 20.0);

            setMethod = squareClass.getMethod("setSideLength", double.class);
            setMethod.invoke(square, 30.0);

            Method getMethod = squareClass.getMethod("getX");
            double x = (Double) getMethod.invoke(square);

            getMethod = squareClass.getMethod("getY");
            double y = (Double) getMethod.invoke(square);

            getMethod = squareClass.getMethod("getSideLength");
            double sideLength = (Double) getMethod.invoke(square);

            assertEquals("-SQUARE CLASS: X value is incorrect", 10.0, x, 0);
            assertEquals("-SQUARE CLASS: Y value is incorrect", 20.0, y, 0);
            assertEquals("-SQUARE CLASS: Side length value is incorrect", 30.0, sideLength, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -SQUARE CLASS: constructor missing from Square class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -SQUARE CLASS: constructor missing from Square class");
        }
        catch(Exception e){
            fail("-SQUARE CLASS: testConstructors failed due to an unexpected exception: " + e.getMessage());
        }

        try{
            Class<?> squareClass = Class.forName("Square");
            Constructor<?> constructor = squareClass.getConstructor(double.class, double.class);
            Object square = constructor.newInstance(10.0, 20.0);

            Method setMethod = squareClass.getMethod("setSideLength", double.class);
            setMethod.invoke(square, 30.0);

            Method getMethod = squareClass.getMethod("getX");
            double x = (Double) getMethod.invoke(square);

            getMethod = squareClass.getMethod("getY");
            double y = (Double) getMethod.invoke(square);

            getMethod = squareClass.getMethod("getSideLength");
            double sideLength = (Double) getMethod.invoke(square);

            assertEquals("-SQUARE CLASS: X value is incorrect", 10.0, x, 0);
            assertEquals("-SQUARE CLASS: Y value is incorrect", 20.0, y, 0);
            assertEquals("-SQUARE CLASS: Side length value is incorrect", 30.0, sideLength, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -SQUARE CLASS: constructor missing from Square class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -SQUARE CLASS: constructor missing from Square class");
        }
        catch(Exception e){
            fail("-SQUARE CLASS: testConstructors failed due to an unexpected exception: " + e.getMessage());
        }

        try{
            Class<?> squareClass = Class.forName("Square");
            Constructor<?> constructor = squareClass.getConstructor(double.class, double.class, double.class);
            Object square = constructor.newInstance(10.0, 20.0, 30.0);

            Method getMethod = squareClass.getMethod("getX");
            double x = (Double) getMethod.invoke(square);

            getMethod = squareClass.getMethod("getY");
            double y = (Double) getMethod.invoke(square);

            getMethod = squareClass.getMethod("getSideLength");
            double sideLength = (Double) getMethod.invoke(square);

            assertEquals("-SQUARE CLASS: X value is incorrect", 10.0, x, 0);
            assertEquals("-SQUARE CLASS: Y value is incorrect", 20.0, y, 0);
            assertEquals("-SQUARE CLASS: Side length value is incorrect", 30.0, sideLength, 0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -SQUARE CLASS: constructor missing from Square class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -SQUARE CLASS: constructor missing from Square class");
        }
        catch(Exception e){
            fail("-SQUARE CLASS: testConstructors failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetSetX(){
        try {
            Class<?> squareClass = Class.forName("Square");
            Constructor<?> constructor = squareClass.getConstructor();
            Object square = constructor.newInstance();

            Method setMethod = squareClass.getMethod("setX", double.class);
            setMethod.invoke(square, 10.0);

            Method getMethod = squareClass.getMethod("getX");
            double x = (Double) getMethod.invoke(circle);

            assertEquals("-SQUARE CLASS: setX method did not set the radius correctly.", 10.0, x, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -SQUARE CLASS: x getter and/or setter missing from Square class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -SQUARE CLASS: x getter and/or setter missing from Square class");
        }
        catch(Exception e){
            fail("-SQUARE CLASS: testGetSetX failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetSetY(){
        try {
            Class<?> squareClass = Class.forName("Square");
            Constructor<?> constructor = squareClass.getConstructor();
            Object square = constructor.newInstance();

            Method setMethod = squareClass.getMethod("setY", double.class);
            setMethod.invoke(square, 20.0);

            Method getMethod = squareClass.getMethod("getY");
            double y = (Double) getMethod.invoke(circle);

            assertEquals("-SQUARE CLASS: setY method did not set the radius correctly.", 20.0, y, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -SQUARE CLASS: y getter and/or setter missing from Square class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -SQUARE CLASS: y getter and/or setter missing from Square class");
        }
        catch(Exception e){
            fail("-SQUARE CLASS: testGetSetY failed due to an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetSetSideLength(){
        try {
            Class<?> squareClass = Class.forName("Square");
            Constructor<?> constructor = squareClass.getConstructor();
            Object square = constructor.newInstance();

            Method setMethod = squareClass.getMethod("setSideLength", double.class);
            setMethod.invoke(square, 30.0);

            Method getMethod = squareClass.getMethod("getSideLength");
            double sideLength = (Double) getMethod.invoke(circle);

            assertEquals("-SQUARE CLASS: setSideLength method did not set the side length correctly.", 30.0, sideLength, 0.0);
        }
        catch (ClassNotFoundException e){
            fail("MISSING: -SQUARE CLASS: sideLength getter and/or setter missing from Square class");
        }
        catch (NoSuchMethodException e){
            fail("MISSING: -SQUARE CLASS: sideLength getter and/or setter missing from Square class");
        }
        catch(Exception e){
            fail("-SQUARE CLASS: testGetSetSideLength failed due to an unexpected exception: " + e.getMessage());
        }
    }

   @Test
   public void testArea(){
         try {
              Class<?> squareClass = Class.forName("Square");
              Constructor<?> constructor = squareClass.getConstructor();
              Object square = constructor.newInstance();
    
              Method setMethod = squareClass.getMethod("setSideLength", double.class);
              setMethod.invoke(square, 5.0);
    
              Method getMethod = squareClass.getMethod("getArea");
              double area = (Double) getMethod.invoke(square);
    
              assertEquals("-SQUARE CLASS: getArea method did not return the correct area.", 25.0, area, 0.0);
         }
         catch (ClassNotFoundException e){
              fail("MISSING: -SQUARE CLASS: getArea method missing from Circle class");
         }
         catch (NoSuchMethodException e){
              fail("MISSING: -SQUARE CLASS: getArea method missing from Square class");
         }
         catch(Exception e){
              fail("-SQUARE CLASS: testArea failed due to an unexpected exception: " + e.getMessage());
         }
    }
    
     @Test
     public void testToString(){
          try {
                Class<?> squareClass = Class.forName("Square");
                Constructor<?> constructor = squareClass.getConstructor();
                Object square = constructor.newInstance();
    
                Method getMethod = squareClass.getMethod("toString");
                String str = (String) getMethod.invoke(square);
    
                assertEquals("-SQUARE CLASS: toString method did not return the correct string.", "[]", str);
          }
          catch (ClassNotFoundException e){
                fail("MISSING: -SQUARE CLASS: toString method missing from Square class");
          }
          catch (NoSuchMethodException e){
                fail("MISSING: -SQUARE CLASS: toString method missing from Square class");
          }
          catch(Exception e){
                fail("-SQUARE CLASS: testToString failed due to an unexpected exception: " + e.getMessage());
          }
     }

     @Test
     public void testDraw(){
            try {
                    Class<?> squareClass = Class.forName("Square");
                    Constructor<?> constructor = squareClass.getConstructor();
                    Object square = constructor.newInstance();
        
                    // Redirect System.out to a buffer
                    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(outContent));
        
                    Method drawMethod = squareClass.getMethod("draw");
                    drawMethod.invoke(square);
        
                    String expectedOutput = "[]";
        
                    // Remove new line characters
                    String actualOutput = outContent.toString().replace("\n", "").replace("\r", "");
        
                    assertEquals(
                        String.format(
                            "-SQUARE CLASS: draw method did not print the correct string. Expected: '%s', but was: '%s'",
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
                    fail("MISSING: -SQUARE CLASS: draw method missing from Square class");
            }
            catch (NoSuchMethodException e){
                    fail("MISSING: -SQUARE CLASS: draw method missing from Square class");
            }
            catch(Exception e){
                    fail("-SQUARE CLASS: testDraw failed due to an unexpected exception: " + e.getMessage());
            }
     }
}
