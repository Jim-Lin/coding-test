import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Q1 {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        fourSumCount(stack);

        System.out.println("there are " + stack);
    }

    private static void fourSumCount(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int size =  stack.size();

        for (int i = 0; i < size; i++) {
            queue.add(stack.pop());
        }

        while (!queue.isEmpty()) {
            // odd number
            if (queue.size() == 1) {
                stack.push(queue.poll());
            } else {
                // move last to first
                for (int i = 0; i < queue.size() - 1; i++) {
                    queue.add(queue.poll());
                }

                stack.push(queue.poll());
                stack.push(queue.poll());
            }
        }
    }
}
