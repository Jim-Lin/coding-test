public class Q157 {

    public static void main(String args[]) {
        System.out.println(q157("carrace"));
        System.out.println(q157("daily"));
    }

    private static boolean q157(String s) {
        int left = 0;
        int length = s.length();
        int right = length % 2 == 0 ? length - 1 : length - 2;

        for (; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }

        return true;
    }
}
