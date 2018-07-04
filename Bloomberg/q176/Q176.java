public class Q176 {

    public static void main(String args[]) {
        System.out.println(q176("abc", "bcd"));
        System.out.println(q176("foo", "bar"));
    }

    private static boolean q176(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int i = 0, j = 0;

        for (; i < ch1.length; i++) {
            if (j != 0 && ch1[i] != ch2[j]) {
                return false;
            }

            if (ch1[i] == ch2[j]) {
                j++;
            }
        }

        return j == 0 ? false : true;
    }
}
