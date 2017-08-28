package br.com.diegogusava.algorithms.problems.dynamic;

public class CoinChange {

    public static int naive(int[] coins, int amount, int index) {

        if (amount < 0) {
            return 0;
        }

        if (amount == 0) {
            return 1;
        }

        if (index == coins.length) {
            return 0;
        }

        return naive(coins, amount - coins[index], index) + naive(coins, amount, index + 1);


    }


    public static int execute(int[] coins, int amount) {


        int[][] result = new int[coins.length + 1][amount + 1];

        for (int i = 0; i <= coins.length; i++) {
            result[i][0] = 1;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int w = 1; w <= amount; w++) {

                final int coin = coins[i - 1];

                if (coin <= w) {
                    result[i][w] = result[i - 1][w] + result[i][w - coin];
                } else {
                    result[i][w] = result[i - 1][w];
                }


            }
        }

        return result[coins.length][amount];


    }

}
