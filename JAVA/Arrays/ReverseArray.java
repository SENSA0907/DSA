package JAVA.Arrays;

import java.util.Arrays;

public class ReverseArray {

    static int[] reverseArray(int[] arr) {

        if (arr.length == 1) return arr;

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }

    // SC - O(1) ----- TC - O(n/2)
    static int[] reverseArrayTwoPointer(int[] arr) {
        
        if (arr.length == 1) return arr;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[] {1,2,3,4,5,6})));
        System.out.println(Arrays.toString(reverseArray(new int[] {1,2,3,4,5})));
        System.out.println(Arrays.toString(reverseArrayTwoPointer(new int[] {1,2,3,4,5,6})));
        System.out.println(Arrays.toString(reverseArrayTwoPointer(new int[] {1,2,3,4,5})));
    }
}
