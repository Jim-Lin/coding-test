import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix {

    public static void main(String args[]) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // int matrix[][] = {
        //     {1,  2,  3,  4,  5,  6},
        //     {7,  8,  9,  10, 11, 12},
        //     {13, 14, 15, 16, 17, 18}
        // };

        System.out.println("the matrix in spiral order is " + spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int rowMin = 0;
        int rowMax = matrix.length - 1;
        int colMin = 0;
        int colMax = matrix[0].length - 1;

        while (rowMin <= rowMax && colMin <= colMax) {
            for (int i = colMin; i <= colMax; i++) {
                result.add(matrix[rowMin][i]);
            }

            rowMin++;

            for (int i = rowMin; i <= rowMax; i++) {
                result.add(matrix[i][colMax]);
            }

            colMax--;

            if (rowMin <= rowMax) {
                for (int i = colMax; i >= colMin; i--) {
                    result.add(matrix[rowMax][i]);
                }

                rowMax--;
            }

            if (colMin <= colMax) {
                for (int i = rowMax; i >= rowMin; i--) {
                    result.add(matrix[i][colMin]);
                }

                colMin++;
            }
        }

        return result;
    }
}
