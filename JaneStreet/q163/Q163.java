import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Q163 {

    public static void main(String args[]) {
        List<Object> list1 = Arrays.asList(5, 3, '+');
        System.out.println(q163(list1));

        List<Object> list2 = Arrays.asList(15, 7, 1, 1, '+', '-', '/', 3, '*', 2, 1, 1, '+', '+', '-');
        System.out.println(q163(list2));
    }

    private static int q163(List<Object> list) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj.getClass() == Integer.class) {
                stack.push((Integer) obj);
            } else {
                switch ((Character) obj) {
                    case '+':
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case '-':
                        stack.push(-stack.pop() + stack.pop());
                        break;
                    case '*':
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case '/':
                        stack.push(((Double) ((1.0 / stack.pop()) * stack.pop())).intValue());
                        break;
                }
            }
        }

        return stack.pop();
    }
}
