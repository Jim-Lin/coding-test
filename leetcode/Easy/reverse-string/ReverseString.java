public class ReverseString {

    public static void main(String args[]) {
        String input = "world";
        System.out.println(input + " reversed string is " + reverseString(input));
    }

    private static String reverseString(String input) {
        if (input.length() <= 1) {
            return input;
        }
        
        char[] ary = input.toCharArray();

        for (int i = 0, j = ary.length - 1; i < ary.length / 2; i++, j--) {
            char temp = ary[j];
            ary[j] = ary[i];
            ary[i] = temp;
        }

        return String.valueOf(ary);
    }
}
