/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntListTest {
    @Test
    public void testDataSetup() {
        Field[] fields = IntList.class.getDeclaredFields();

        boolean hasDataIntArray = false;
        for (Field field : fields) {
            if (field.getType().equals(int[].class)) {
                if (field.getName().equals("data")) {
                    hasDataIntArray = true;
                }
            }
        }

        assertTrue("data field in IntList class is not an array of 100 integers", hasDataIntArray);
    }

    @Test
    public void testAddSetup() {
        Method[] methods = IntList.class.getDeclaredMethods();

        boolean hasAddMethodWithIntParam = false;
        for (Method method : methods) {
            if (method.getName().equals("add")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(int.class)) {
                    hasAddMethodWithIntParam = true;
                }
            }
        }

        assertTrue("add method in IntList class does not take an integer as input", hasAddMethodWithIntParam);
    }

    @Test
    public void testSum(){
        IntList list = new IntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals("Sum of list is incorrect", 15, list.sum());
    }

    @Test
    public void testIndexOfFound(){
        IntList list = new IntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals("indexOf method in IntList did not return correct result", 2, list.indexOf(3));
    }

    @Test
    public void testIndexOfNotFound(){
        IntList list = new IntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals("indexOf method in IntList did not return correct result", -1, list.indexOf(6));
    }
   
}
