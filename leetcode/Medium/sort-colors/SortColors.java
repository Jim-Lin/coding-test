import java.util.Arrays;

public class SortColors {

    static int[] nums = {1, 1, 0, 2, 0, 2};

    public static void main(String args[]) {
        System.out.println(Arrays.toString(nums) + " sort the same color are adjacent:");
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int i = 0, redTail = 0, blueHead = nums.length - 1;
        while (i <= blueHead) {
            if (nums[i] == 0) {
                nums[i++] = 1;
                nums[redTail++] = 0;
            } else if (nums[i] == 2) {
                nums[i] = nums[blueHead];
                nums[blueHead--] = 2;
            } else {
                i++;
            }
        }
    }
}
