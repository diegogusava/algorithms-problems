package br.com.diegogusava.algorithms.problems.binary;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountNumberOneTest {
    @Test
    public void count() throws Exception {

        final CountNumberOne counter = new CountNumberOne();
        final int count = counter.count(15);
        System.out.println(count);
    }

}
