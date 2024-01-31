package lv.rvt;

import org.junit.Test;
import org.junit.runner.manipulation.Sorter;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public abstract class SorterTest {
    @Test
    public static int indexOfSmallest(int[] array){
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        for ( int i = 0; i < numbers.length; i++){
            int indexOfSmallest = indexOfSmallest(numbers);
            Arrays.sort(numbers, i, indexOfSmallest);
        }
        return 0;
    }
}
