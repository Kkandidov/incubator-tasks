package astashonok.sorting;

import java.util.Arrays;

import static astashonok.Service.*;

public class Merge {
    static int[] mergeSorting(int[] array){
        if (array.length < 2){
            return array;
        }

        int[] arrayA = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] arrayB = Arrays.copyOfRange(array, array.length / 2, array.length);

        arrayA = mergeSorting(arrayA);
        arrayB = mergeSorting(arrayB);
        return mergeSortedArrays(arrayA, arrayB);
    }

    private static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            result[k++] = array1[i] < array2[j] ? array1[i++] : array2[j++];
        }
        while (i < array1.length) {
            result[k++] = array1[i++];
        }
        while (j < array2.length) {
            result[k++] = array2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int[] array = new int[15];
            init(array, -10, 10);
            print("Before: ");
            print(array);
            array = mergeSorting(array);
            print("After: ");
            print(array);
            print("Are the arrays sorted correct? - ");
            println(validSortedArray(array));
        }
    }
}
