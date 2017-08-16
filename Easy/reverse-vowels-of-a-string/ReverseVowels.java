public class ReverseVowels {

    public static void main(String args[]) {
        String input = "hello world";
        System.out.println(input + " reversed vowels of string is " + reverseVowels(input));
    }

    private static String reverseVowels(String input) {
        if (input.length() <= 1) {
            return input;
        }

        String vowels = "aeiouAEIOU";
        char[] ary = input.toCharArray();

        for (int i = 0, j = ary.length - 1; i < j; ) {
            if (!vowels.contains(ary[i] + "")) {
                i++;
                continue;
            }

            if (!vowels.contains(ary[j] + "")) {
                j--;
                continue;
            }

            char temp = ary[j];
            ary[j] = ary[i];
            ary[i] = temp;

            i++;
            j--;
        }

        return String.valueOf(ary);
    }
}
