public class MergeSort1 {

    public static void main(String args[]) {
        int[] inputs = {9, 16, 10, 6, 0};

        int[] sort = mergeSort(inputs);
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(sort[i] + " ");
        }
    }

    private static int[] mergeSort(int[] inputs) {
        if (inputs.length == 1) {
            return inputs;
        }

        int mid = inputs.length / 2;

        int[] left = new int[mid];
        for (int i = 0; i < mid; i++) {
            left[i] = inputs[i];
        }

        int[] right = new int[inputs.length - mid];
        for (int i = mid; i < inputs.length; i++) {
            right[i - mid] = inputs[i];
        }

        int[] mergeSortLeft = mergeSort(left);
        int[] mergeSortRight = mergeSort(right);

        return sort(mergeSortLeft, mergeSortRight);
    }

    private static int[] sort(int[] left, int[] right) {
        int indexLeft = 0, indexRight = 0, index = 0;
        int[] sort = new int[left.length + right.length];

        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                sort[index++] = left[indexLeft++];
            } else {
                sort[index++] = right[indexRight++];
            }
        }

        while (indexLeft < left.length) {
            sort[index++] = left[indexLeft++];
        }

        while (indexRight < right.length) {
            sort[index++] = right[indexRight++];
        }

        // sub append list
        /* for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }

        System.out.println(""); */

        return sort;
    }
}
