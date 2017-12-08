import java.util.List;
import java.util.ArrayList;

public class Permutations {

    public static void main(String args[]) {
        System.out.println("all possible permutations of [1, 2, 3]: " + permute(new int[]{1, 2, 3}));
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<Integer>(tempList));

            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) {
                continue;
            }

            tempList.add(nums[i]);
            backtrack(result, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}
