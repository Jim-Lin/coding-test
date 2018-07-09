import java.util.List;
import java.util.ArrayList;

public class Q181 {

    public static void main(String args[]) {
        System.out.println(q181("racecarannakayak"));
        System.out.println(q181("abc"));
    }

    private static List<String> q181(String s) {
        List<String> result = new ArrayList<>();
        char[] ary = s.toCharArray();
        int start = 0;

        while (start < s.length()) {
            int end = getPalindromeEndIndex(ary, start);
            int count = end - start + 1;
            result.add(new String(ary, start, count));
            start += count;
        }

        return result;
    }

    private static int getPalindromeEndIndex(char[] ary, int start) {
        int end = ary.length - 1, i = start;

        for (int j = end; i < j; ) {
            if (ary[i] == ary[j]) {
                i++;
                j--;
            } else {
                if (start != i) {
                    i = start;
                    end = j;
                } else {
                    end = --j;
                }
            }
        }

        return end;
    }
}
