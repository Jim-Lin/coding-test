public class MergeSort2 {

    private static int[] inputs = {9, 16, 10, 6, 0};

    public static void main(String args[]) {
        mergeSort(0, inputs.length - 1);
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(inputs[i] + " ");
        }
    }

    private static void mergeSort(int low, int high) {
        if (low == high) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(low, mid);
        mergeSort(mid + 1, high);

        sort(low, mid, high);
    }

    private static void sort(int low, int mid, int high) {
        int indexLeft = low, indexRight = mid + 1, index = 0;
        int[] sort = new int[high - low + 1];

        while (indexLeft <= mid && indexRight <= high) {
            if (inputs[indexLeft] < inputs[indexRight]) {
                sort[index++] = inputs[indexLeft++];
            } else {
                sort[index++] = inputs[indexRight++];
            }
        }

        while (indexLeft <= mid) {
            sort[index++] = inputs[indexLeft++];
        }

        while (indexRight <= high) {
            sort[index++] = inputs[indexRight++];
        }

        for (int i = 0; i < sort.length; i++) {
            inputs[low + i] = sort[i];
        }

        // sub append list
        /* for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }

        System.out.println(""); */
    }
}
