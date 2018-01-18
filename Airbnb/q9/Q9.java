public class Q9 {

    public static void main(String args[]) {
        int[] nums = {5, 1, 1, 5};
        System.out.println(q9(nums));
    }

    private static int q9(int[] nums) {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 2; j < nums.length; j++) {
                int sum =  nums[i] + nums[j];
                if (sum > result) {
                    result = sum;
                }
            }
        }

        return result;
    }
}
