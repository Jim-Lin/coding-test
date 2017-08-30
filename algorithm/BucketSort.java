import java.util.Arrays;

public class BucketSort {

    public static void main(String args[]) {
        int[] data = {12, 3, 8, 9, 12, 3, 1, 14, 8, 6, 7, 5};

        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }

        System.out.println(Arrays.toString(bucketSort(data, max)));
    }

    private static int[] bucketSort(int[] data, int max) {
        int[] bucket = new int[max + 1];

        for (int i = 0; i < data.length; i++) {
            bucket[data[i]]++;
        }

        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                data[index++] = i;
            }
        }

        return data;
    }
}
