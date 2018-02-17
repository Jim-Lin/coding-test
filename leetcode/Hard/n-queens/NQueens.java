import java.util.List;
import java.util.ArrayList;

public class NQueens {

    public static void main(String args[]) {
        System.out.println("the 4-queens puzzle: " + solveNQueens(4));
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n < 4) {
            return result;
        }

        arrangeQueens(result, new int[n], 0);

        return result;
    }


    private static void arrangeQueens(List<List<String>> result, int[] queens, int pos) {
        if (queens.length == pos) {
            addResult(result, queens);

            return;
        }

        for (int i = 0; i < queens.length; i++) {
            queens[pos] = i;
            if (isValid(queens, pos)) {
                arrangeQueens(result, queens, pos + 1);
            }
        }
    }

    private static boolean isValid(int[] queens, int pos) {
        for (int i = 0; i < pos; i++) {
            // in the same column
            if (queens[i] == queens[pos]) {
                return false;
            }

            // diagonal: the same difference of row and column
            if (Math.abs(queens[i] - queens[pos]) == Math.abs(i - pos)) {
                return false;
            }
        }

        return true;
    }

    private static void addResult(List<List<String>> result, int[] queens) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < queens.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < queens.length; j++) {
                if (queens[i] == j) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }

            list.add(sb.toString());
        }

        result.add(list);
    }
}
