import java.util.List;
import java.util.Arrays;

public class WordBreak {

    public static void main(String args[]) {
        System.out.println("can \"leetcode\" be segmented as \"leet code\"? " + wordBreak("leetcode", Arrays.asList("leet", "code")));
    }

    private static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;

                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
