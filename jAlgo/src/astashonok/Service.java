package astashonok;

import java.util.Arrays;
import java.util.Random;

public class Service {
    //fills the array with random ints in the range from begin to end
    public static void init(int[] array, int from, int to) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((to - from + 1)) + from;
        }
    }

    //getting random ints element in the range from begin to end
    public static int getRandomElement(int from, int to){
        Random random = new Random();
        return random.nextInt((to - from + 1)) + from;
    }

    //message output to the console with line feed
    public static void println(Object s) {
        if (s instanceof int[]) {
            System.out.println(Arrays.toString((int[]) s));
        } else {
            System.out.println(s);
        }
    }

    //message output to the console without line feed
    public static void print(Object s) {
        if (s instanceof int[]) {
            System.out.print(Arrays.toString((int[]) s) + "  ");
        } else {
            System.out.print(s + "  ");
        }
    }

    // checking correction of astashonok.sorting of array
    public static boolean validSortedArray(int[] array) {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        return Arrays.equals(temp, array);
    }
}
