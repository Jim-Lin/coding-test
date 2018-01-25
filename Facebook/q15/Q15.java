import java.util.Random;
import java.util.Arrays;

public class Q15 {

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(q15(nums, 1)));
    }

    private static int[] q15(int[] stream, int k) {
        int[] result = new int[k];
        int i = 0;

        while (i < k) {
            result[i++] = stream[i];
        }

        for (; i < stream.length; i++) {
            Random rand = new Random();
            int r = rand.nextInt(i + 1);

            if (r < k) {
                result[r] = stream[i];
            }
        }

        return result;
    }
}
