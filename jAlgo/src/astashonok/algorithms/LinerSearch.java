package astashonok.algorithms;

import java.util.Arrays;

import static astashonok.Service.*;

public class LinerSearch {

    public static int linerSearch(int array[], int element) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element)
                return index;
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
            println(linerSearch(array, element));
        }
    }
}
