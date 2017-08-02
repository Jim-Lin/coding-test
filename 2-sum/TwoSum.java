import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public static void main(String args[]) {
        int[] nums = {9, 16, 10, 6, 0};
        int[] result = twoSum(nums, 16);
        if (result.length == 0) {
            System.out.println("not found");

            return;
        }

        System.out.println("index1 is " + result[0] + " and index2 is " + result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = indexMap.get(target - nums[i]);
            if (index == null) {
                indexMap.put(nums[i], i);
            } else {
                result = new int[]{index, i};

                break;
            }
        }

        return result;
    }
}
