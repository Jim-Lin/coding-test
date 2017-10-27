import java.util.Arrays;

public class MoveZeroes {

    static int[] nums = {0, 1, 0, 3, 12};

    public static void main(String args[]) {
        System.out.println(Arrays.toString(nums) + " move all 0's to the end and maintain the order:");
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
