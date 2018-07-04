import java.util.Random;
import java.util.function.Supplier;

public class Q175 {

    private static Supplier<Character> stateSupplier(double[] probabilities) {
        return () -> {
            double c = probabilities[2];
            double b = probabilities[2] + probabilities[1];
            double a = probabilities[2] + probabilities[1] + probabilities[0];
            Random rand = new Random();
            double value = rand.nextDouble();

            if (value < c) {
                return 'c';
            } else if (value < b) {
                return 'b';
            } else {
                return 'a';
            }
        };
    }

    public static void main(String args[]) {
        int[] result = q169(new double[]{1.0, 0, 0}, 5000);
        System.out.println("{ 'a': " + result[0] + ", 'b': " + result[1] + ", 'c': " + result[2] + " }");
    }

    private static int[] q169(double[] start, int num_steps) {
        int[] result = {0, 0, 0};

        while (num_steps > 0) {
            start = getProbabilities(start);
            char state = stateSupplier(start).get();

            if (state == 'a') {
                result[0] += 1;
            } else if (state == 'b') {
                result[1] += 1;
            } else {
                result[2] += 1;
            }

            num_steps--;
        }

        return result;
    }

    private static double[] getProbabilities(double[] start) {
        double[] result = {0, 0, 0};

        result[0] = start[0] * 0.9 + start[1] * 0.15 + start[2] * 0.25;
        result[1] = start[0] * 0.075 + start[1] * 0.8 + start[2] * 0.25;
        result[2] = start[0] * 0.025 + start[1] * 0.05 + start[2] * 0.5;

        return result;
    }
}
