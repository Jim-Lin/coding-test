import java.lang.Math;
import java.util.Arrays;

public class Q626 {

    public static void main(String args[]) {
        System.out.println(q626(new int[]{-10, -10, 5, 2}));
    }

    private static int q626(int[] list) {
        int size = list.length;
        if (size < 3) {
            return 0;
        } else if (size == 3) {
            return list[2] * list[1] * list[0];
        }
        
        Arrays.sort(list);

        return Math.max(
            list[size - 1] * list[size - 2] * list[size - 3],
            list[size - 1] * list[1] * list[0]
        );
    }
}
