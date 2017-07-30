package br.com.diegogusava.algorithms.problems.string;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StringSuffixTest {

    @Test
    public void get() throws Exception {

        final List<String> diego = StringSuffix.get("diego");
        System.out.println(diego);

    }

}