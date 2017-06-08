public class SqrtNewton {

    public static void main(String args[]) {
        double[] inputs = {9, 16, 10, 6.7, 0.3};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Square Root of " + inputs[i] + " is: " + sqrt(inputs[i]));
        }
    }

    private static double sqrt(double value) {
        if (value < 0) {
            // throw new Exception("can not caculate!");
            return -1;
        }

        if (value == 0 || value == 1) {
            return value;
        }

        double x = value / 2;
        int times = 100;

        while (times-- > 0) {
            if (x * x == value) {
                return x;
            } else {
                // x = x - ((x * x - value) / 2 * x);
                x = (x + (value / x)) / 2;
            }
        }

        return x;
    }
}
