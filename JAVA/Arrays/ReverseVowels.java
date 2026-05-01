package JAVA.Arrays;

public class ReverseVowels {

    static boolean includes(char[] arr, char target) {
        for (char n : arr) {
            if (n == target) return true;
        }
        return false;
    }

    static String reverseVowels (String s) {

        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        if (s.length() == 1) return s;

        int start = 0;
        int end = s.length() - 1;

        char[] str = s.toCharArray();

        while(start < end) {
            if (!includes(vowels, str[start])) {
                start++;
                continue;
            }
            if (!includes(vowels, str[end])) {
                end--;
                continue;
            }

            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }

        String output = String.copyValueOf(str);

        return output;
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }
}
