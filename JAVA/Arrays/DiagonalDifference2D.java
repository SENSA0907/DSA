package JAVA.Arrays;

public class DiagonalDifference2D {

    static int diagonalDifference(int[][] mat) {
        int primaryRowSum = 0;
        int secondaryRowSum = 0;

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                if (i == j) primaryRowSum += mat[i][j];
                if (i+j == mat[0].length -1) secondaryRowSum += mat[i][j];
            }
        }

        return Math.abs(secondaryRowSum-primaryRowSum);
    }

    static int diagonalDifferenceOptimised(int[][] mat) {
        int primaryRowSum = 0;
        int secondaryRowSum = 0;
        int matLen = mat.length;

        for (int i=0; i<matLen; i++) {
            primaryRowSum += mat[i][i]; // representing j interms of i
            secondaryRowSum += mat[i][matLen-1-i]; // i+j = n-1 --> j = n-1-i
        }

        return Math.abs(secondaryRowSum-primaryRowSum);
    }
    public static void main(String[] args) {
        System.out.println(diagonalDifference(new int[][] {{1,2,3}, {4,5,6}, {9,8,9}}));
        System.out.println(diagonalDifference(new int[][] {{1,2,3,4}, {4,5,6,7}, {9,8,9,11}, {54,56,56,78}}));
        System.out.println(diagonalDifferenceOptimised(new int[][] {{1,2,3}, {4,5,6}, {9,8,9}}));
        System.out.println(diagonalDifferenceOptimised(new int[][] {{1,2,3,4}, {4,5,6,7}, {9,8,9,11}, {54,56,56,78}}));
    }
}
