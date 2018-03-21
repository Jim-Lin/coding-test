import java.util.Random;
import java.util.function.IntSupplier;

public class Q71 {

    private static IntSupplier rand7 = () -> {
        Random rand = new Random();

        return (rand.nextInt(7) + 1);
    };

    public static void main(String args[]) {
        System.out.println(rand5());
    }

    // private static int rand5() {
    //     Random rand = new Random();
    //     int sum = 0;
    //
    //     // 5 ~ 35, WRONG!!!
    //     // 5, 10, 15, 20, 25, 30, 35
    //     // 6, 11, 16, 21, 26, 31
    //     // 7, 12, 17, 22, 27, 32
    //     // 8, 13, 18, 23, 28, 33
    //     // 9, 14, 19, 24, 29, 34
    //     for (int i = 0; i < 5; i++) {
    //         sum += (rand.nextInt(7) + 1);
    //     }
    //
    //     return (sum % 5 + 1);
    // }

    private static int rand5() {
        int rand = 0;

        do {
            rand = rand7.getAsInt();
        } while (rand > 5);

        return (rand % 5 + 1);
    }
}
