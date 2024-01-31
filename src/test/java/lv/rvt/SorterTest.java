package lv.rvt;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import rvt.Sorted;

public class SorterTest {
    @Test
    public void testSmallest() {

        int[] array = {1, 3, 5, 2};
        assertEquals(1, Sorted.smallest(array));
        System.out.println(array);
    }
    @Test
    public void indexOfSmallest(){
        int[] array = {1, 5, 3, 6, -3};
        assertEquals(1, Sorted.indexOfSmallest(array));
        System.out.println(array);
    }
    @Test
    public void IndexOfSmallestFrom(int[] table, int startIndex) {
        int[] array = {1, 7, 6, 4, 5, 3};

        System.out.println(0);
        System.out.println(1);
        System.out.println(2);

    }
    @Test
    // Part 5: Sorting
    public void sort(int[] array, int searched){
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(array);
    }
}
