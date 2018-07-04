import java.util.Arrays;

public class Q168 {

    public static void main(String args[]) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(q168(matrix1)));

        int[][] matrix2 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        System.out.println(Arrays.deepToString(q168(matrix2)));
    }

    private static int[][] q168(int[][] matrix) {
        for (int row = 0; row < matrix.length / 2; row++) {
            for (int col = row; col < matrix.length - row - 1; col++) {
                int leftTop = matrix[row][col];

                // leftBottom -> leftTop
                matrix[row][col] = matrix[matrix.length - col - 1][row];
                // rightBottom -> leftBottom
                matrix[matrix.length - col - 1][row] = matrix[matrix.length - row - 1][matrix.length - col - 1];
                // rightTop -> rightBottom
                matrix[matrix.length - row - 1][matrix.length - col - 1] = matrix[col][matrix.length - row - 1];
                // leftTop -> rightTop
                matrix[col][matrix.length - row - 1] = leftTop;
            }
        }

        return matrix;
    }
}
