package JAVA.Arrays;

import java.util.Arrays;

public class LeadersInArray {

    static int[] leadersInArrayBruteForce(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) isLeader = false;
            }
            if (isLeader) result[i] = arr[i];
        }

        return result;
    }

    // since last element is always a LEADER
    // start from right most end, n-1
    // traverse towards left
    // if left item is greater than max, make that as new max
    // so all in the right are less than the current ana that is leader
    static void leadersInArrayOptimised(int[] arr) {
        int max = arr[arr.length-1];
        System.out.println(max);
        for (int i = arr.length - 2; i>=0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println(arr[i]);
            }      
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leadersInArrayBruteForce(new int[]{17,16,17,3,4,2,3})));
        leadersInArrayOptimised(new int[] {17,16,17,3,4,2,3});
        leadersInArrayOptimised(new int[] {16,17,4,3,5,2});
    }

    // Note
    // Leader greates in Left side
    // Traverse from left to right and maintain max

    // Leader is small in right side
    // Traverse from right to left and maintain min

    // Leader is small in left side
    // traverse from left to right and amintain min
}
