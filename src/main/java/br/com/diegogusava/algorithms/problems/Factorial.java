package br.com.diegogusava.algorithms.problems;

public class Factorial {

    public int recursive(int n) {

        if (n == 1) {
            return 1;
        }

        return n * recursive(n - 1);
    }

    public int recursive(int n, int acc) {

        if (n == 1) {
            return acc;
        }

        return recursive(n - 1, acc * n);
    }

    public int iterative(int n) {

        if (n == 1) {
            return 1;
        }

        int acc = 1;

        for (int i = 2; i <= n; i++) {
            int result = acc * i;
            acc = result;
        }

        return acc;
    }


}
