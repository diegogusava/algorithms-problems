package br.com.diegogusava.algorithms.problems.dynamic;

/**
 * Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins,
 * how many ways can we make the change? The order of coins doesn’t matter.
 *
 * For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}.
 * So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2},
 * {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.
 *
 *
 *
 * S = {1, 2} - N = 4
 *
 * total = 1
 * coin  = 1
 *
 * total = 2
 * coin = 1 + 1
 *        2
 *
 * total = 3
 * coin = 1 + 1 + 1
 *        1 + 2
 *
 * total = 4
 * coin = 1 + 1 + 1 + 1
 *        1 + 1 + 2
 *        2 + 2
 */
public class CoinChange {

    public static int execute(int[] coins, int cents) {

        int[][] result = new int[coins.length + 1][cents + 1];

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= cents; j++) {

                final int coin = coins[i - 1];

                final int previous = result[i][j - 1];

                final int curr = coin + previous;


                if (curr == j) {
                    result[i][j] = curr;
                }

                if (coin <= j) {
                    final int curr2 = coin + result[i - 1][j - coin];

                    if (curr2 == j) {
                        result[i][j] = curr2;
                    }
                }

            }
        }

        return 2;

    }
}
