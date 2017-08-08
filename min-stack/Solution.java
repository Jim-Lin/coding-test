public class Solution {

    public static void main(String args[]) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("get min is " + minStack.getMin());
        minStack.pop();
        System.out.println("top is " + minStack.top());
        System.out.println("get min is " + minStack.getMin());
    }
}
