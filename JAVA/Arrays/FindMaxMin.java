package JAVA.Arrays;

import java.util.Arrays;

class FindMaxMin {

    static int[] findMaxMinBrute(int[] arr) {
        Arrays.sort(arr);

        return new int[] { arr[0], arr[arr.length - 1]};
    }

    static int[] findMaxMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[] { min, max };
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMaxMinBrute(new int[]{1,2,4,6})));
        System.out.println(Arrays.toString(findMaxMin(new int[]{1,2,4,6})));
    }
}