package br.com.diegogusava.algorithms.problems.binary;

public class Conversion {

    public String decimalToBinary(int decimal) {

        StringBuilder binary = new StringBuilder();

        while (decimal != 0) {
            binary.insert(0, decimal % 2);
            decimal = decimal / 2;
        }

        return binary.toString();

    }


}
