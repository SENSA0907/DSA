package JAVA.Arrays;

import java.util.Arrays;

public class FizzBuzz {
    static void fizzBuzz(int n) {
        String[] arr = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i%15 == 0) {
                arr[i-1] = "FizzBuzz";
            } else if (i%5 == 0) {
                arr[i-1] = "Buzz";
            } else if(i%3 == 0) {
                arr[i-1] = "Fizz";
            } else arr[i-1] = Integer.toString(i);
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
