import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Q57 {

    public static void main(String args[]) {
        System.out.println(Arrays.toString(q57("the quick brown fox jumps over the lazy dog", 10)));
    }

    private static String[] q57(String s, int k) {
        String[] words = s.split(" ");
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < words.length; ) {
            StringBuilder sb = new StringBuilder(words[i]);
            int length = words[i].length();

            if (length > k) {
                return null;
            }

            while (i + 1 < words.length && length + 1 + words[i + 1].length() <= k) {
                i += 1;
                sb.append(" ").append(words[i]);
                length = length + 1 + words[i].length();
            }

            list.add(sb.toString());
            i++;
        }

        return list.stream().toArray(String[]::new);
    }
}
