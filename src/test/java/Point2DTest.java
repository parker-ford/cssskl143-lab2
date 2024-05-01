/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Point2DTest {
    @Test
    public void testClassVariables() {
        Field[] fields = Point2D.class.getDeclaredFields();

        boolean hasPrivateX = false;
        boolean hasPrivateY = false;

        for (Field field : fields) {
            if (field.getType().equals(int.class)) {
                if (field.getName().equals("x") && Modifier.isPrivate(field.getModifiers())) {
                    hasPrivateX = true;
                } else if (field.getName().equals("y") && Modifier.isPrivate(field.getModifiers())) {
                    hasPrivateY = true;
                }
            }
        }

        assertTrue("X variable in Point2D class is missing or non-private", hasPrivateX);
        assertTrue("Y variable in Point2D class is missing or non-private", hasPrivateY);
    }

    @Test
    public void testSetters(){
        Point2D point = new Point2D();
        point.setX(5);
        point.setY(10);

        Field[] fields = Point2D.class.getDeclaredFields();

        int x = 0;
        int y = 0;

        for (Field field : fields) {
            if (field.getType().equals(int.class)) {
                try {
                    if (field.getName().equals("x")) {
                        field.setAccessible(true);
                        x = field.getInt(point);
                    } else if (field.getName().equals("y")) {
                        field.setAccessible(true);
                        y = field.getInt(point);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        assertEquals("X value in Point2D class is set incorrectly", 5, x);
        assertEquals("Y value in Point2D class is set incorrectly", 10, y);

    }
    
    @Test
    public void testGetters(){
        Point2D point = new Point2D();
        point.setX(5);
        point.setY(10);

        assertEquals("X value in Point2D class is retrieved incorrectly", 5, point.getX());
        assertEquals("Y value in Point2D class is retrieved incorrectly", 10, point.getY());
    }

    @Test
    public void testResetToOrigin(){
        Point2D point = new Point2D();
        point.setX(5);
        point.setY(10);

        point.resetToOrigin();

        assertEquals("resetToOrigin method in Point2D class does not reset points correctly", 0, point.getX());
        assertEquals("resetToOrigin method in Point2D class does not reset points correctly", 0, point.getY());
    }

    @Test
    public void testTranslate(){
        Point2D point = new Point2D();
        point.setX(5);
        point.setY(10);

        point.translate(5, 10);

        assertEquals("translate method in Point2D class does not translate points correctly", 10, point.getX());
        assertEquals("translate method in Point2D class does not translate points correctly", 20, point.getY());
    }

    @Test
    public void testToString(){
        Point2D point = new Point2D();
        point.setX(5);
        point.setY(10);

         String result = point.toString();

        assertTrue("toString method in Point2D class is not functioning correctly. It should contain x and y values", result.contains("5") && result.contains("10"));

    }

    @Test
    public void testEquals(){
        Point2D point1 = new Point2D();
        point1.setX(5);
        point1.setY(10);

        Point2D point2 = new Point2D();
        point2.setX(5);
        point2.setY(10);

        Point2D point3 = new Point2D();
        point3.setX(10);
        point3.setY(5);

        assertTrue("equals method in Point2D class is not functioning correctly. It should return true if two points have the same x and y values", point1.equals(point2));
        assertTrue("equals method in Point2D class is not functioning correctly. It should return false if two points have different x and y values", !point1.equals(point3));
    }
}
