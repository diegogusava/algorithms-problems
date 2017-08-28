package br.com.diegogusava.algorithms.problems.string;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by diegogusava on 7/16/17.
 */
public class StringPrefixTest {
    @Test
    public void get() throws Exception {
        final List<String> diego = StringPrefix.get("diego");
        System.out.println(diego);
    }

}