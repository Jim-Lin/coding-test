public class PowerOfTwo {

    public static void main(String args[]) {
        System.out.println("is 1 power of 2: " + isPowerOfTwo(1));
        System.out.println("is 10 power of 2: " + isPowerOfTwo(10));
    }

    private static boolean isPowerOfTwo(int n) {
        // return (n > 0) && (Integer.bitCount(n) == 1);

        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
