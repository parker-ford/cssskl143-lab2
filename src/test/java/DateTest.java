/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;
import java.lang.reflect.Field;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DateTest {
    @Test
    public void testClassVariables() {
        Field[] fields = Date.class.getDeclaredFields();

        boolean hasMonth = false;
        boolean hasDay = false;
        boolean hasYear = false;

        for (Field field : fields) {
            if (field.getType().equals(int.class)) {
                if (field.getName().equals("month")) {
                    hasMonth = true;
                } else if (field.getName().equals("day")) {
                    hasDay = true;
                } else if (field.getName().equals("year")) {
                    hasYear = true;
                }
            }
        }

        assertTrue("Month variable in Time class is missing or setup incorrectly", hasMonth);
        assertTrue("Day variable in Time class is missing or setup incorrectly", hasDay);
        assertTrue("Year variable in Time class is missing or setup incorrectly", hasYear);
    }

    @Test
    public void testSetDate() {
        Date date = new Date();
        date.setDate(10, 11, 2000);

        Field[] fields = Date.class.getDeclaredFields();

        int month = 0;
        int day = 0;
        int year = 0;

        for (Field field : fields) {
            if (field.getType().equals(int.class)) {
                try {
                    if (field.getName().equals("month")) {
                        field.setAccessible(true);
                        month = field.getInt(date);
                    } else if (field.getName().equals("day")) {
                        field.setAccessible(true);
                        day = field.getInt(date);
                    } else if (field.getName().equals("year")) {
                        field.setAccessible(true);
                        year = field.getInt(date);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        assertEquals("Month value in Time class is not set correctly", 10, month);
        assertEquals("Day value in Time class is not set correctly", 11, day);
        assertEquals("Year value in Time class is not set correctly", 2000, year);
    }

    @Test
    public void testReport() {
        Date date = new Date();
        date.setDate(10, 11, 2000);

        // Redirect System.out to a buffer
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        date.report();

        String expectedOutput = "10/11/2000";

        // Remove new line characters
        String actualOutput = outContent.toString().replace("\n", "").replace("\r", "");

        assertEquals(
            String.format(
                "Report method in Time class is not functioning correctly. Expected: '%s', but was: '%s'",
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
