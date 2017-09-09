import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String args[]) {
        int[] nums1 = new int[7];
        nums1[0] = 4;
        nums1[1] = 8;
        nums1[2] = 9;
        nums1[3] = 12;
        int[] nums2 = {1, 3, 7};

        merge(nums1, 4, nums2, 3);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1, i2 = n - 1, index = i1 + i2 + 1;

        for (; (i1 > -1 && i2 > -1);) {
            if (nums1[i1] > nums2[i2]) {
                nums1[index--] = nums1[i1--];
            } else {
                nums1[index--] = nums2[i2--];
            }
        }

        while (i2 > -1) {
            nums1[index--] = nums2[i2--];
        }

        System.out.println("merge sorted array: " + Arrays.toString(nums1));
    }
}
