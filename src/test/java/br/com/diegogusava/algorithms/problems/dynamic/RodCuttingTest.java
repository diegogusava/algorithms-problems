package br.com.diegogusava.algorithms.problems.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diegogusava on 7/15/17.
 */
public class RodCuttingTest {

    @Test
    public void maxPrice() throws Exception {

//        final int result = RodCutting.maxPrice(new int[]{1, 2, 3, 4}, new int[]{2, 5, 7, 3}, 5);
//        System.out.println(result);

        RodCutting.cuts(new int[]{1, 2, 3, 4}, new int[]{2, 5, 7, 3}, 5).forEach(x -> System.out.println(x));
    }



}