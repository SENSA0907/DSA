package JAVA.Arrays;

import java.util.Arrays;

public class TransposeMatrix {

    static int[][] transposeMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i=0; i<rows; i++) {
            for (int j = 0; j< cols; j++) {
                transposedMatrix[j][i] = mat[i][j]; 
            }
        }
        return transposedMatrix;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transposeMatrix(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}})));
    }
}
