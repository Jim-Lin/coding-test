import java.util.Arrays;

public class ShellSort {

    private static int[] inputs = {9, 16, 10, 6, 0};
    // private static int[] inputs = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};

    public static void main(String args[]) {
        shellSort();
        System.out.println(Arrays.toString(inputs));
    }

    private static void shellSort() {
        int length = inputs.length;

        for (int gap = length / 2; gap > 0; gap /= 2) {

            // check the index from the gap size to the end
            for (int i = gap; i < length; i++) {
                int temp = inputs[i];
                int j;

                // check every gap size before the i index
                for (j = i; (j >= gap && inputs[j - gap] > temp); j -= gap) {
                    inputs[j] = inputs[j - gap];
                }

                inputs[j] = temp;
            }
        }
    }
}
