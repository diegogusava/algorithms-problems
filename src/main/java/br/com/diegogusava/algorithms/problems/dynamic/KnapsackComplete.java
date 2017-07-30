package br.com.diegogusava.algorithms.problems.dynamic;

/**
 * Created by diegogusava on 7/12/17.
 */
public class KnapsackComplete {

    private int[][] result;
    private int[] values;
    private int[] weight;

    public KnapsackComplete(int[] values, int[] weight) {
        this.values = values;
        this.weight = weight;
    }

    public int execute(int knapWeight) {

        result = new int[values.length + 1][knapWeight + 1];


        for (int i = 1; i <= values.length; i++) {

            for (int w = 1; w <= knapWeight; w++) {


                int valueLessCurrent = result[i - 1][w];

                int valueWithCurrent = 0;
                if (w >= weight[i - 1]) {
                    System.out.println(i + " " + w + " " + weight[i - 1]);
                    valueWithCurrent = values[i - 1] + result[i - 1][w - weight[i - 1]];
                }

                result[i][w] = Math.max(valueLessCurrent, valueWithCurrent);

            }

        }

        return result[values.length][knapWeight];

    }


}
