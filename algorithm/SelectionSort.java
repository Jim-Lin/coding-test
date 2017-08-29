import java.util.Arrays;

public class SelectionSort {

    private static int[] inputs = {9, 16, 10, 6, 0};
    // private static int[] inputs = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};

    public static void main(String args[]) {
        selectionSort();
        System.out.println(Arrays.toString(inputs));
    }

    private static void selectionSort() {
        int length = inputs.length;

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (inputs[j] < inputs[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int min = inputs[minIndex];
                inputs[minIndex] = inputs[i];
                inputs[i] = min;
            }
        }
    }
}
