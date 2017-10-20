public class SumTwoIntegers {

    public static void main(String args[]) {
        System.out.println("sum of two integers 1 and 2 is " + getSum(1, 2));
    }

    private static int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return b;
        }

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
