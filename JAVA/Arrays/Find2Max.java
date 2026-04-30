package JAVA.Arrays;

import java.util.Arrays;

public class Find2Max {

    static int[] find2MaxBrute(int [] arr) {

        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        Arrays.sort(arr);

        return new int[] { arr[arr.length -1], arr[arr.length-2]};
    }

    static int[] find2Max(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (firstMax < arr[i]) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        return new int[] { firstMax, secondMax };
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find2MaxBrute(new int[] {10, 12, 20, 4})));
        System.out.println(Arrays.toString(find2MaxBrute(new int[] {10, 20, 20, 4})));
        // System.out.println(Arrays.toString(find2MaxBrute(new int[] {4})));

        System.out.println(Arrays.toString(find2Max(new int[] {10, 12, 20, 4})));
        System.out.println(Arrays.toString(find2Max(new int[] {10, 20, 20, 4})));
        // System.out.println(Arrays.toString(find2Max(new int[] {4})));
    }
}
