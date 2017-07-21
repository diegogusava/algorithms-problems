package br.com.diegogusava.algorithms.problems.binary;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by diego on 29/06/17.
 */
public class PowerOfTwoTest {

    @Test
    public void test() {
        final PowerOfTwo powerOfTwo = new PowerOfTwo();
        for (int i = 0; i <= 1024; i++) {
            final boolean is = powerOfTwo.isPowerOfTwo(i);
            System.out.println(i + " -> " + is);
        }

    }

}
