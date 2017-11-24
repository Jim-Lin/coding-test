import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray {

    public static void main(String args[]) {
        ShuffleAnArray shuffleArray = new ShuffleAnArray();

        int[] nums = {1, 2, 3};
        Solution obj = shuffleArray.new Solution(nums);
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();

        System.out.println("reset the array [1, 2, 3]: " + Arrays.toString(param_1));
        System.out.println("shuffle the array [1, 2, 3]: " + Arrays.toString(param_2));
    }

    class Solution {

        private final int[] nums;
        private Random rand;

        public Solution(int[] nums) {
            this.nums = nums;
            rand = new Random();
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return nums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            int[] clone = nums.clone();

            for (int i = clone.length - 1; i > 0; i--) {
                int shuffleIndex = rand.nextInt(i + 1);

                int temp = clone[i];
                clone[i] = clone[shuffleIndex];
                clone[shuffleIndex] = temp;
            }

            return clone;
        }
    }
}
