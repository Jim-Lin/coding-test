import java.util.Arrays;

public class BubbleSort {

    private static int[] inputs = {9, 16, 10, 6, 0};
    // private static int[] inputs = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};

    public static void main(String args[]) {
        bubbleSort();
        System.out.println(Arrays.toString(inputs));
    }

    private static void bubbleSort() {
        int length = inputs.length;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if (inputs[j] < inputs[j - 1]) {
                    int temp = inputs[j];
                    inputs[j] = inputs[j - 1];
                    inputs[j - 1] = temp;
                }
            }
        }
    }
}
