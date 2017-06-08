public class SqrtBinary {

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

        double low = 0;
        double high = value;
        double precision = 0.00001;

        if (value > 0 && value < 1) {
            high = 1;
        }

        while ((high - low) > precision) {
            double mid = (high + low) / 2;
            double square = mid * mid;

            if (square == value) {
               return mid;
            } else if (square > value) {
               high = mid;
            } else { // square < value
                low = mid;
            }
        }

        return (high + low) / 2;
    }
}
