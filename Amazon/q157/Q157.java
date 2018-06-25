import java.util.Map;
import java.util.HashMap;

public class Q157 {

    public static void main(String args[]) {
        System.out.println(q157("carrace"));
        System.out.println(q157("daily"));
    }

    private static boolean q157(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] ary = s.toCharArray();
        for (char c : ary) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int odd = 0;
        for (Integer v : map.values()) {
            if (v % 2 != 0) {
                odd++;
            }
        }

        return (odd > 1) ? false : true;
    }
}
