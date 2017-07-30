package br.com.diegogusava.algorithms.problems.dynamic;

public class SubsetSumProblem {

    public static boolean execute(int[] set, int sum) {

        boolean[][] result = new boolean[set.length + 1][sum + 1];

        //With
        for (int i = 0; i < result.length; i++) {
            result[i][0] = true;
        }

        for (int i = 1; i <= result.length; i++) {
            for (int j = 1; j <= sum; j++) {



            }
        }

        return result[set.length][sum];
    }
}
