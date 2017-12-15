import java.util.Arrays;

public class CoinChange {

    public static void main(String args[]) {
        System.out.println("coins = [1, 2, 5], amount = 11, the fewest number of coins is " + coinChange(new int[]{1, 2, 5}, 11));
    }

    private static int coinChange(int[] coins, int amount) {
        int[] min = new int[amount + 1];
        Arrays.fill(min, Integer.MAX_VALUE - 1);
        min[0] = 0; // 0 + every coin => min[coin_number] = 1

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                int sum = i + coins[j];
                if (sum <= amount) {
                    min[sum] = Math.min(min[sum], min[i] + 1);
                }
            }
        }

        return min[amount] == (Integer.MAX_VALUE - 1) ? -1 : min[amount];
    }
}
