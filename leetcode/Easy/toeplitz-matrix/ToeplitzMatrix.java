public class ToeplitzMatrix {

    public static void main(String args[]) {
        int[] row1 = {1, 2, 3, 4};
        int[] row2 = {5, 1, 2, 3};
        int[] row3 = {9, 5, 1, 2};
        int[][] matrix = {row1, row2, row3};

        System.out.println("is the matrix Toeplitz: " + isToeplitzMatrix(matrix));
    }

    private static boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
