package rvt;
import java.util.Arrays;

public class Sorted {

    // Part 1: Finding the smallest valuea
    public static int smallest(int[] array) {
        // find smallest digit inside paramater array
        int smallest = array[0];
        for(int i=0; i<array.length; i++) { 
            if(smallest > array[i]) {
                smallest = array[i];
            }

        }
        return smallest;
    }


    // Part 2: Index of the smallest value
    public static int indexOfSmallest(int[] array){
        for ( int i = 0; i < array.length; i++){
            int indexOfSmallest = indexOfSmallest(array);
            Arrays.sort(array, i, indexOfSmallest);
        }
        return 0;

    }

    // Part 3: Index of the smallest value after a certain value
    public static int IndexOfSmallestFrom(int[] table, int startIndex) {
        
      
    }

    // Part 5: Sorting
    public static int sort(int[] array, int searched){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                Arrays.sort(array);
                System.out.println(Arrays.toString(array));
            }
        }
        return searched;
    }

}
