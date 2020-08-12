import java.util.List;
import java.util.LinkedList;

public class Q489 {

    public static void main(String args[]) {
        System.out.println(q489(new int[]{5, 1, 3, 5, 2, 3, 4, 1}));
    }

    private static int q489(int[] array) {
        List<Integer> result = new LinkedList<>();

        for (int i : array) {
            if (result.contains(i)) {
                result.clear();
            }

            result.add(i);
        }

        System.out.println(result);

        return result.size();
    }
}
