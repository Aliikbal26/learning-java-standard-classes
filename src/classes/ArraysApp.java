package classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] listNumber = {
                1, 2, 3, 4, 5, 6, 7, 19, 2, 29, 12, 1, 5, 16, 20
        };

        Arrays.sort(listNumber);
        System.out.println(Arrays.toString(listNumber));
        System.out.println(Arrays.binarySearch(listNumber, 2));

        int[] number1 = Arrays.copyOf(listNumber, 5);
        System.out.println(Arrays.toString(number1));
    }
}
