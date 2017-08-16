import java.util.Arrays;

public class PlusOne {

    public static void main(String args[]) {
        int[] digits1 = {1, 8, 4, 5};
        int[] digits2 = {9, 9, 9};

        System.out.println(Arrays.toString(digits1) + " plus one is " + Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(digits2) + " plus one is " + Arrays.toString(plusOne(digits2)));
    }

    private static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;

                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[length + 1];
        result[0] = 1;

        return result;
    }
}
