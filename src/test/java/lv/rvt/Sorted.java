package lv.rvt;
import java.util.Arrays;

public abstract class Sorted {
    private static void smallest(int[] array) {
        int[] number = {6, 5, 8, 7, 1};
        System.out.println("Smallest: " + MainProgram.smallest(number));

    }
    public static int indexOfSmallest(int[] array){
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        for ( int i = 0; i < numbers.length; i++){
            int indexOfSmallest = indexOfSmallest(numbers);
            Arrays.sort(numbers, i, indexOfSmallest);
        }
        return 0;

    }
    public static void IndexOfSmallestFrom(int[] table, int startIndex) {
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static void swap(int[] array, int index1, int index2) {
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }
}
