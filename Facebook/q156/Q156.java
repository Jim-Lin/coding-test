public class Q156 {

    public static void main(String args[]) {
        System.out.println(q156(13));
        System.out.println(q156(27));

        // 3: 4^2 1^1 1^1
        // 2: 3^2 3^2
        System.out.println(q156(18));
    }

    private static int q156(int n) {
        int min = n; // 1 + 1 + ...
        int i = 2;
        Integer square;

        while ((square = i * i) <= n) {
            min = Math.min(min, 1 + q156(n - square));
            i++;
        }

        return min;
    }
}
