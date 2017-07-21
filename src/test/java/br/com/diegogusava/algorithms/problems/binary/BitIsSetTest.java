package br.com.diegogusava.algorithms.problems.binary;

import org.junit.Test;

public class BitIsSetTest {
    @Test
    public void isSet() throws Exception {

        final boolean set = new BitIsSet().isSet(8, 3);
        System.out.println(set);

    }

}
