package br.com.diegogusava.algorithms.problems.dynamic;

/*
 * Given an array of integer numbers
 * Your task is to write a function that prints to the standard output (stdout) the largest sum that
 * can be obtained using any sequence of consecutive elements from the array
 * 
 * Note that your function will receive the following arguments:
 * numbers which is the array of integers described above
 * 
 * Data constraints
 * the length of the array will not exceed 200,000 each element of the array will be in the [-10000, 10000]
 *
 * Efficiency constraints
 * Your function is expected to print the requested result and return in less than 2 seconds
 * 
 * Example
 * Input Output
 * numbers: 2, -3, 2, 2, -1, 2, -2, 1
 * 5
 * Explanation:
 * The sequence: 2, 2, -1, 2 has sum 5 which is the largest possible.
 *
 * https://pt.wikipedia.org/wiki/Sublista_cont%C3%ADgua_de_soma_m%C3%A1xima
 */
public class SumSequence {

    // 2, -3, 2, 2, -1, 2, -2, 1
    // 2, -1, 1, 3,  2, 4,  2, 1
    //    -3,-1, 2,
    //        2, 4,  3, 5,  3, 4
    public static int sum(int[] array) {

        int total = array[0] < 0 ? 0 : array[0];
        int max = total;

        for (int i = 1; i < array.length; i++) {
            total += array[i];

            if (total < 0) {
                total = 0;
            }

            if (total > max) {
                max = total;
            }

        }

        return max;
    }

}
