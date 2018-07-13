import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Q180 {

    public static void main(String args[]) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        System.out.println(q180(stack1));

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        System.out.println(q180(stack2));
    }

    private static Stack<Integer> q180(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.empty()) {
            queue.add(stack.pop());
        }

        while (queue.size() > 0) {
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.poll());
            }

            if (queue.size() == 1) {
                stack.push(queue.poll());
                break;
            }

            stack.push(queue.poll());
            stack.push(queue.poll());
        }

        return stack;
    }
}
