package br.com.diegogusava.algorithms.problems.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumSequenceTest {

    @Test
    public void sum1() throws Exception {
        final int sum = SumSequence.sum(new int[] { 2, -3, 2, 2, -1, 2, -2, 1 });
        assertEquals(5, sum);
    }

    @Test
    public void sum2() throws Exception {
        final int sum = SumSequence.sum(new int[] { 2, -3, 2, 2, -1, 2, -2, 1 });
        assertEquals(5, sum);
    }

}
