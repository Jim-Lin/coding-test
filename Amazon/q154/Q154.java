import java.util.PriorityQueue;

public class Q154 {

    public static void main(String args[]) {
        Q154 q154 = new Q154();
        Stack stack = q154.new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        try {
            System.out.println(stack.pop());
        } catch (Exception e) {}
    }

    class Stack {
        int counter = 0;
        PriorityQueue<Element> heap = new PriorityQueue<>();

        void push(int item) {
            heap.add(new Element(item, counter++));
        }

        int pop() throws Exception {
            if (heap.isEmpty()) {
                throw new Exception("Stack is empty");
            }

            return heap.poll().value;
        }
    }

    class Element implements Comparable<Element> {
        public int value;
        public int counter;

        Element(int value, int counter) {
            this.value = value;
            this.counter = counter;
        }

        @Override
        public int compareTo(Element o) {
            return this.counter > o.counter ? -1 : 1;
        }
    }
}
