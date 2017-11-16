import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class TopKFrequent {

    public static void main(String args[]) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println("the 2 most frequent elements of " + Arrays.toString(nums) + " is " + topKFrequent(nums, 2));
    }

    private static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new LinkedList<Integer>();
            }

            buckets[freq].add(num);
        }

        List<Integer> result = new ArrayList<Integer>();
        for (int i = nums.length; i > 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }

        return result;
    }
}
