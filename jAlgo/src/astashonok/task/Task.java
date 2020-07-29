package astashonok.task;

public class Task {
    public static final int FIRST_STARS_COUNT = 5;

    public static void main(String[] args) {
        for (int i = 0; i < FIRST_STARS_COUNT; i++) {
            for (int j = 0; j < FIRST_STARS_COUNT - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
