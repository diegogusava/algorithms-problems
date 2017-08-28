package br.com.diegogusava.algorithms.problems.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diegogusava on 7/16/17.
 */
public class StringReverseTest {
    @Test
    public void reverseWithStringBuilder() throws Exception {

        String value = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String result1 = StringReverse.reverseWithStringBuilder(value);
        final String result2 = StringReverse.reverseInline(value);
        System.out.println(result1);
        System.out.println(result2);
        assertEquals(result1, result2);

    }

}