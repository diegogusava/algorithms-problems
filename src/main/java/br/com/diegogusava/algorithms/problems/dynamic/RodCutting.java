package br.com.diegogusava.algorithms.problems.dynamic;

import java.util.ArrayList;
import java.util.List;

public class RodCutting {

    public static int maxPrice(int[] rodLengths, int[] prices, int total) {
        return execute(rodLengths, prices, total)[rodLengths.length][total];
    }


    public static int[][] execute(int[] rodLengths, int[] prices, int total) {

        int[][] result = new int[rodLengths.length + 1][total + 1];

        for (int i = 1; i <= rodLengths.length; i++) {
            for (int j = 1; j <= total; j++) {

                int rodLength = rodLengths[i - 1];

                if (rodLength <= j) {
                    final int without = result[i - 1][j];
                    final int with = prices[i - 1] + result[i][j - rodLength];
                    result[i][j] = Math.max(without, with);
                } else {
                    result[i][j] = result[i - 1][j];
                }

            }
        }

        return result;
    }

    public static List<Integer> cuts(int[] rodLengths, int[] prices, int total) {
        List<Integer> cuts = new ArrayList<>();

        final int[][] result = execute(rodLengths, prices, total);

        int j = total;
        int i = rodLengths.length;

        while (i > 0) {

            final int r = result[i][j];

            if (r == result[i - 1][j]) {
                i--;
            } else {
                cuts.add(rodLengths[i - 1]);
                j = j - rodLengths[i - 1];
            }

        }

        return cuts;
    }

}
