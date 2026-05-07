package JAVA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Given an Array int[] with size of n and a target
// find the pairs of element which sums to traget

// input [0 -1 2 -3 1 -1] and target -2
// output --> [(-1,-1), (-3,1)]

// 3 variations of this question?
// print the pairs or Count the pair or Print index of pairs
public class TwoSum {

    static void twoSumBrute (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("pairs are" + " " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }

    // SOrt and Two Pointer
    // Not suitaboe when index is needed as we are sorting
    static void twoSumBetter (int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        // when only one pair need to be return --> while(start < end) {
        // O(N logN)
        while(start <= end) {
            int currentSum = arr[start] + arr[end];
            if (currentSum == target) {
                System.out.println("pairs are" + " " + arr[start] + " and " + arr[end]);
                start++;
                end--;
            }
            if (currentSum > target) {
                end--;
            } else if (currentSum < target) {
                start++;
            }
        }
    }

    // Hashing solution - Optimized one for Unsorted Array
    static void twoSumOptimized(int[] arr, int target) {
        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < arr.length -1; i++) {
            int complement = target - arr[i];
            if (s.contains(complement)) {
                System.out.println("pairs are " + arr[i] + " and " + complement);
            }
            s.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        // twoSumBrute(new int[] {0, -1,2,-3,1,-1}, -2);
        // twoSumBetter(new int[] {0, -1,2,-3,1,-1}, -2);
        // twoSumBetter(new int[] {1,2,3,4,5,5}, 6);
        twoSumOptimized(new int[] {1,2,3,4,5,5}, 6);
    }
}
