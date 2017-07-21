package br.com.diegogusava.algorithms.problems.binary;

import org.junit.Test;

public class ConversionTest {
    @Test
    public void decimalToBinary() throws Exception {
        final Conversion conversion = new Conversion();

        for (int i = 0; i <= 1024; i++) {
            final String binary = conversion.decimalToBinary(i);
            System.out.println(i + " -> " + binary);
        }

    }

}
