import java.util.Map;
import java.util.HashMap;

public class LongestSubstringKDistinct {

    public static void main(String args[]) {
        System.out.println("sum of two integers 1 and 2 is " + lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    private static int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int j = 0, result = 0;

        for (int i = 0; i < s.length(); i++) {
            char right = s.charAt(i);
            map.put(right, map.getOrDefault(right, 0) + 1);

            while (map.size() > k) {
                char left = s.charAt(j);
                map.put(left, map.get(left) - 1);
                
                if (map.get(left) == 0) {
                    map.remove(left);
                }

                j++;
            }

            result = Math.max(result, i - j + 1);
        }

        return result;
    }
}
