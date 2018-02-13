import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class Q27 {

    public static void main(String args[]) {
        System.out.println(q27("([])[]({})"));
        System.out.println(q27("([)]"));
        System.out.println(q27("((()"));
    }

    private static boolean q27(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                stack.push(c);
            } else if (map.get(c) != stack.pop()) {
                return false;
            }
        }

        return stack.empty();
    }
}
