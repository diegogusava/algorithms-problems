package br.com.diegogusava.algorithms.problems.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diegogusava on 7/16/17.
 */
public class LongestCommonPrefixTest {
    @Test
    public void get() throws Exception {

        final String result = LongestCommonPrefix.get("diego", "diego");
        assertEquals(result, "diego");

    }

}