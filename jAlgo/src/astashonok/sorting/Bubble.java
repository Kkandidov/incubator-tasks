package astashonok.sorting;

import static astashonok.Service.*;

public class Bubble {
    static void bubble(int[] array) {
        boolean sorted;
        for (int i = 0; i < array.length - 1; i++) {
            sorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int[] array = new int[15];
            init(array, -10, 10);
            print("Before: ");
            print(array);
            bubble(array);
            print("After: ");
            print(array);
            print("Are the arrays sorted correct? - ");
            println(validSortedArray(array));
        }
    }
}
