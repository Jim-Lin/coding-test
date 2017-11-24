import java.util.Map;
import java.util.HashMap;

public class FourSumII {

    public static void main(String args[]) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        System.out.println("there are " + fourSumCount(A, B, C, D) + " tuples (i, j, k, l) such that A[i] + B[j] + C[k] + D[l] is zero");
    }

    // a + b + c + d = 0
    // a + b = -(c + d)
    private static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int c : C) {
            for (int d : D) {
                int sum = -(c + d);
                result += map.getOrDefault(sum, 0);
            }
        }

        return result;
    }
}
