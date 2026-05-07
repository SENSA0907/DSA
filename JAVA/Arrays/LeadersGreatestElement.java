package JAVA.Arrays;

import java.util.Arrays;

// LC-1299
// Replace elements with greatest element on Right side
// input [17,18,5,4,6,1]
// last element always -1
// output [18,6,6,6,1,-1]


// Homework to be done..
public class LeadersGreatestElement {

    static int[] greatestElementsToRight (int[] arr) {
        int[] result = new int[arr.length];

        int max = arr[arr.length -1];

        result[result.length-1] = -1;

        for(int i = result.length -2; i>=0; i--) {
            System.out.println(arr[i]);
            System.out.println(max);
            System.out.println("****");
            result[i] = max;
            if (arr[i] > max) {
                max = arr[i];
            } 
            
        }
        
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(greatestElementsToRight(new int[] {17,18,5,4,6,1})));
    }
}
