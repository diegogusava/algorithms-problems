package br.com.diegogusava.algorithms.problems.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diegogusava on 7/13/17.
 */
public class KnapsackCompleteTest {

    @Test
    public void test() {
        final int[] values = {3,2,3,5};
        final int[] weight = {1,3,5,7};

        final int total = new KnapsackComplete(values, weight).execute(7);
        System.out.println(total);
    }

}