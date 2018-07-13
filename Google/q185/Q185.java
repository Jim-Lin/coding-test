public class Q185 {

    public static void main(String args[]) {
        System.out.println(q185(
            new int[]{1, 4},
            new int[]{3, 3},
            new int[]{0, 5},
            new int[]{4, 3}
        ));
    }

    private static int q185(int[] topLeft1, int[] dimensions1, int[] topLeft2, int[] dimensions2) {
        int[] bottomRight1 = {
            topLeft1[0] + dimensions1[0] - 1,
            topLeft1[1] + dimensions1[1] - 1
        };
        int[] bottomRight2 = {
            topLeft2[0] + dimensions2[0] - 1,
            topLeft2[1] + dimensions2[1] - 1
        };

        int top = Math.max(topLeft1[0], topLeft2[0]);
        int bottom = Math.min(bottomRight1[0], bottomRight2[0]);
        if (top > bottom) {
            return 0;
        }

        int left = Math.max(topLeft1[1], topLeft2[1]);
        int right = Math.min(bottomRight1[1], bottomRight2[1]);
        if (left > right) {
            return 0;
        }

        return (bottom - top + 1) * (right - left + 1);
    }
}
