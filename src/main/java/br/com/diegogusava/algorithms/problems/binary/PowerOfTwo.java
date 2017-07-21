package br.com.diegogusava.algorithms.problems.binary;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int number) {
        int result = (number & (number - 1));
        return result == 0;
    }

}
