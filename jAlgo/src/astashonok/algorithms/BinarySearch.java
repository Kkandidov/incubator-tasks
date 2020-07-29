package astashonok.algorithms;

import java.util.Arrays;

import static astashonok.Service.*;

public class BinarySearch {

    // iterative approach
    public static int itBinSearch(int array[], int element) {

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] == element) {
                return middleIndex;
            } else if (array[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > element){
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    // recursive approach
    public static int recBinSearch(int array[], int element) {
        return recBinSearch(array, 0, array.length-1, element);
    }

    private static int recBinSearch(int array[], int firstElement, int lastElement, int element) {

        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (array[mid] == element){
                return mid;
            }

            if (array[mid] > element){
                return recBinSearch(array, firstElement, mid - 1, element);
            }

            return recBinSearch(array, mid + 1, lastElement, element);
        }

        return -1;
    }



    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int[] array = new int[10];
            init(array, -10, 10);
            Arrays.sort(array);
            print(array);
            int element = getRandomElement(-10, 10);
            print("Is there the " + element +" element into the array:");
            println(itBinSearch(array, element));
        }

        System.out.println();

        for (int i = 0; i < 20; i++) {
            int[] array = new int[10];
            init(array, -10, 10);
            Arrays.sort(array);
            print(array);
            int element = getRandomElement(-10, 10);
            print("Is there the " + element +" element into the array:");
            println(recBinSearch(array, element));
        }

    }
}
