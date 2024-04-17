/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ObjectListTest {
    @Test
    public void testDataSetup() {
        Field[] fields = ObjectList.class.getDeclaredFields();

        boolean hasDataIntArray = false;
        for (Field field : fields) {
            if (field.getType().equals(Object[].class)) {
                hasDataIntArray = true;
            }
        }

        assertTrue("data field in ObjectList class is not an array of 100 Objects", hasDataIntArray);
    }

    @Test
    public void testAddSetup() {
        Method[] methods = ObjectList.class.getDeclaredMethods();

        boolean hasAddMethodWithIntParam = false;
        for (Method method : methods) {
            if (method.getName().equals("add")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(Object.class)) {
                    hasAddMethodWithIntParam = true;
                }
            }
        }

        assertTrue("add method in ObjectList class does not take an Object as input", hasAddMethodWithIntParam);
    }

    @Test
    public void testToString(){
        ObjectList list = new ObjectList();
        list.add(new Square());
        list.add(new Circle());
        
       String result = list.toString();

        assertTrue("Result should contain []", result.contains("[]"));
        assertTrue("Result should contain O", result.contains("O"));
    }

   
   
}
