package lesson;

import java.util.Arrays;

public class massive {
    public static void main(String[] args) {
        int x = 10_000;
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
