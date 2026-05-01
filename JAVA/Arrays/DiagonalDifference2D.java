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
    public static void main(String[] args) {
        System.out.println(diagonalDifference(new int[][] {{1,2,3}, {4,5,6}, {9,8,9}}));
        System.out.println(diagonalDifference(new int[][] {{1,2,3,4}, {4,5,6,7}, {9,8,9,11}, {54,56,56,78}}));
    }
}
