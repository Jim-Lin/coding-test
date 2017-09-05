public class CountPrimes {

    public static void main(String args[]) {
        System.out.println("count prime numbers of less than 100: " + countPrimes(100));
    }

    private static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] notPrimes = new boolean[n];
        int count = 0;

        // less than n
        for (int i = 2; i < n; i++) {
            if (!notPrimes[i]) {
                count++;

                for (int j = 2; i * j < n; j++) {
                    notPrimes[i * j] = true;
                }
            }
        }

        return count;
    }
}
