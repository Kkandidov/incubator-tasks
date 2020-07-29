package astashonok.sorting;

import static astashonok.Service.*;

public class Quick {
    private static int[] ints;

    static void quickSort(int[] array) {
        ints = array;
        quick(0, array.length - 1);
    }

    private static void quick(int low, int high) {
        int i = low, j = high;
        int pivot = ints[i + (j - i) / 2];

        while (i <= j) {
            while (ints[i] < pivot) {
                i++;
            }
            while (ints[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = ints[i];
                ints[i] = ints[j];
                ints[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quick(low, j);
        }
        if (i < high){
            quick(i, high);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int[] array = new int[15];
            init(array, -10, 10);
            print("Before: ");
            print(array);
            quickSort(array);
            print("After: ");
            print(array);
            print("Are the arrays sorted correct? - ");
            println(validSortedArray(array));
        }
    }
}
