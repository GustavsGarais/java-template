package lv.rvt;

public abstract class Sorted {
    public static void smallest(int[] array) {
        int[] intArray = {6, 5, 8, 7, 1};
        for ( int i = 0; i < intArray.length; i++){
            int indexOfSmallest = indexOfSmallest(intArray, i);
            Arrays.sort(intArray, i, indexOfSmallest);
        }

    }
}
