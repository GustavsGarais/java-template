package lv.rvt;

import org.junit.Test;
import org.junit.runner.manipulation.Sorter;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public abstract class SorterTest {
    @Test
    public static void TestSmallest(int[] array) {
        int[] intArray = {6, 5, 8, 7, 1};
        for ( int i = 0; i < intArray.length; i++){
            int indexOfSmallest = indexOfSmallest(intArray, i);
            swap(array, i, indexOfSmallest);
            
            System.out.println(Arrays.toString(intArray));
        }

    }
}
