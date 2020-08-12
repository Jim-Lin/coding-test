public class Q619 {

    public static void main(String args[]) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exists(board, "ABCCED"));
        System.out.println(exists(board, "SEE"));
        System.out.println(exists(board, "ABCB"));
    }

    private static boolean exists(char[][] board, String s) {
        if (board.length == 0) {
            return false;
        }

        if (board[0].length == 0) {
            return false;
        }

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                boolean[][] visit = new boolean[board.length][board[0].length];
                if (dfs(board, s, visit, row, column, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, String s, boolean[][] visit, int row, int column, int index) {
        if (row < 0) {
            return false;
        }

        if (row > board.length - 1) {
            return false;
        }

        if (column < 0) {
            return false;
        }

        if (column > board[0].length - 1) {
            return false;
        }

        if (visit[row][column]) {
            return false;
        }

        if (board[row][column] == s.charAt(index)) {
            if (s.length() == ++index) {
                return true;
            }

            visit[row][column] = true;
            boolean result =
            // top
            dfs(board, s, visit, row - 1, column, index) ||
            // right
            dfs(board, s, visit, row, column + 1, index) ||
            // bottom
            dfs(board, s, visit, row + 1, column, index) ||
            // left
            dfs(board, s, visit, row, column - 1, index);

            // reset visit word
            visit[row][column] = false;

            return result;
        }

        return false;
    }
}
