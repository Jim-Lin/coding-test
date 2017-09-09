import java.util.Arrays;

public class SingleNumber {

    public static void main(String args[]) {
        int[] nums = {9, 16, 0, 9, 0};

        System.out.println(Arrays.toString(nums) + " single number is " + singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }

        return num;
    }
}
