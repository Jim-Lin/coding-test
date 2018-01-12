import java.util.Arrays;

public class Q2 {

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            right = right * nums[i + 1];
            result[i] = result[i] * right;
        }

        return result;
    }
}
