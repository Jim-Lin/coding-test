import java.util.List;
import java.util.LinkedList;

public class Q33 {

    public static void main(String args[]) {
        int[] nums = {2, 1, 5, 7, 2, 0, 5};
        q33(nums);
    }

    private static void q33(int[] nums) {
        float median = nums[0];
        System.out.println(median);

        List<Integer> list = new LinkedList<>();
        list.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int size = list.size();
            if (num > median) {
                for (int j = size / 2; j < size; j++) {
                    if (num > list.get(j)) {
                        continue;
                    } else {
                        list.add(j, num);

                        break;
                    }
                }

                // num greater than all elements of list
                if (size == list.size()) {
                    list.add(num);
                }
            } else {
                for (int j = 0; j < size / 2 + 1; j++) {
                    if (num > list.get(j)) {
                        continue;
                    } else {
                        list.add(j, num);

                        break;
                    }
                }
            }

            size = list.size();
            if (size % 2 == 0) {
                median = (Float.valueOf(list.get(size / 2 - 1)) + Float.valueOf(list.get(size / 2))) / 2;
            } else {
                median = list.get(size / 2);
            }

            System.out.println(median);
        }
    }
}
