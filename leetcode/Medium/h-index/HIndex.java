import java.util.Arrays;

public class HIndex {

    public static void main(String args[]) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println("citations = [3, 0, 6, 1, 5], h-index is " + hIndex(citations));
    }

    private static int hIndex(int[] citations) {
        Arrays.sort(citations);

        int result = 0;
        while (result < citations.length && citations[citations.length - 1 - result] > result) {
            result += 1;
        }

        return result;
    }
}
