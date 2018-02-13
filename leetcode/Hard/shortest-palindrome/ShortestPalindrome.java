public class ShortestPalindrome {

    public static void main(String args[]) {
        System.out.println("the shortest palindrome of abcd is " + shortestPalindrome("abcd"));
    }

    private static String shortestPalindrome(String s) {
        char[] ary = s.toCharArray();
        int left = 0, right = s.length() - 1, end = right;

        while (left < right) {
            if (ary[left] == ary[right]) {
                left++;
                right--;
            } else {
                left = 0;
                end--;
                right = end;
            }
        }

        return new StringBuilder(s.substring(end + 1)).reverse().append(s).toString();
    }
}
