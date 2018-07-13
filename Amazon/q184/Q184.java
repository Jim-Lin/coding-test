public class Q184 {

    public static void main(String args[]) {
        System.out.println(q184(new int[]{42, 56, 14}));
    }

    private static int q184(int[] ary) {
        int result = ary[0];
        for (int i = 1; i < ary.length; i++) {
            result = GCD(result, ary[i]);
        }

        return result;
    }

    private static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a%b);
        }
    }
}
