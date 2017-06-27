package br.com.diegogusava.algorithms.problems.recursion;

/**
 * Euclidean Algorithm
 */
public class GCD {

    public int recursive(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return recursive(num2, num1 % num2);
    }

    public int iterative(int num1, int num2) {

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }

}
