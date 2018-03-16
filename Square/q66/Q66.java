import java.util.function.Function;

public class Q66 {

    public static void main(String args[]) {
        Function<Float, Integer> toss_biased = (p) -> {
            return (Math.random() < p) ? 1 : 0;
        };

        System.out.println(TossUnbiased(toss_biased));
    }

    private static int TossUnbiased(Function<Float, Integer> toss_biased) {
        Integer p1, p2;

        do {
            p1 = toss_biased.apply(0.6f);
            p2 = toss_biased.apply(0.6f);
        } while (p1 == p2);

        return p1;
    }
}
