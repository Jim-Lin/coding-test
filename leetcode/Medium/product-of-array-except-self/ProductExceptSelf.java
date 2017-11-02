import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums) + " product of all the elements except self: " + Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1; // as leftProduct

        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            rightProduct *= nums[i + 1];
            output[i] *= rightProduct;
        }

        return output;
    }
}
