package br.com.diegogusava.algorithms.problems.binary;

public class BitIsSet {

    public boolean isSet(int number, int bit) {
        return ((number & 1 << bit) == (1 << bit));
    }

}
