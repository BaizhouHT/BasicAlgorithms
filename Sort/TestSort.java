package Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSort {

    /** Tests the sort method of the Sort class for String[]. */
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        SelectionSort.sort(input, 0);
        for (int i = 0; i < input.length; i += 1) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position " + i + ", expected: " + expected + ", but got: " + input[i] + ".");
                break;
            }
        }
    }


    /** Tests the sort method of the Sort class testFindSmallest method. */
    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = SelectionSort.findSmallest(input, 0);
        assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 2;

        int actual2 = SelectionSort.findSmallest(input2, 2);
        assertEquals(expected2, actual2);
    }


    /** Tests the sort method of the Sort class for int[]. */
    @Test
    public void testSortIntArr() {
        int[] input =    {6,3,7,2,8,11,2,1};
        int[] expected = {1,2,2,3,6,7,8,11};
        SelectionSort.sort(input);
        for (int i = 0; i < input.length; i += 1) {
            if (input[i]!=expected[i]) {
                System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i] + ".");
                break;
            }
        }
    }
}
