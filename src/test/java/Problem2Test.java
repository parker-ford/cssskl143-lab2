import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6}
                // TODO: add more test cases
        };

        int[][] expects = {
                {0, 1, 2, 4, 6}
                // TODO: add more test cases
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.removeDuplicates(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);

            for (int j = 0; j < actualLength; j++) {

                // (-_-)ゞ why can't we use assertArrayEquals here instead?
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);

            }
        }
    }
}
