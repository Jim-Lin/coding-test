import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {

    public static void main(String args[]) {
        System.out.println("3 pairs of parentheses: " + generateParenthesis(3));
    }

    private static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        dfs(result, "", n, n);

        return result;
    }

    private static void dfs(List<String> result, String s, int left, int right){
        if (left > right) {
            return;
        }

        if (left == 0 && right == 0) {
            result.add(s);

            return;
        }

        if (left > 0) {
            dfs(result, s + "(", left - 1, right);
        }

        if (right > 0) {
            dfs(result, s + ")", left, right - 1);
        }
    }
}
