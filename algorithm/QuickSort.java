import java.util.Arrays;

public class QuickSort {

    private static int[] inputs = {9, 16, 10, 6, 0};
    // private static int[] inputs = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};

    public static void main(String args[]) {
        quickSort(0, inputs.length - 1);
        System.out.println(Arrays.toString(inputs));
    }

    private static void quickSort(int left, int right) {
        if (left < right) {
            int splitIndex = partition(left, right - 1, right);

            quickSort(left, splitIndex - 1);
            quickSort(splitIndex + 1, right);
        }
    }

    private static int partition(int left, int right, int pivot) {
        while (inputs[left] < inputs[pivot]) {
            left++;
        }

        while (left < right && inputs[right] > inputs[pivot]) {
            right--;
        }

        if (left >= right) {
            int temp = inputs[left];
            inputs[left] = inputs[pivot];
            inputs[pivot] = temp;

            // System.out.println(Arrays.toString(inputs));

            return left;
        }

        int temp = inputs[left];
        inputs[left] = inputs[right];
        inputs[right] = temp;

        return partition(left, right, pivot);
    }

    // private static int partition(int left, int right, int pivot) {
    //     for (int i = left--; i <= right; i++) {
    //         if (inputs[i] <= inputs[pivot]) {
    //             ++left; // greater one
    //
    //             int temp = inputs[left];
    //             inputs[left] = inputs[i];
    //             inputs[i] = temp;
    //         }
    //     }
    //
    //     int temp = inputs[++left];
    //     inputs[left] = inputs[pivot];
    //     inputs[pivot] = temp;
    //
    //     // System.out.println(Arrays.toString(inputs));
    //
    //     return left;
    // }
}
