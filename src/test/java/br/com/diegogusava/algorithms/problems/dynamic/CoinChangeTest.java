package br.com.diegogusava.algorithms.problems.dynamic;

import org.junit.Test;

public class CoinChangeTest {

    @Test
    public void execute() {

        final int qtd = CoinChange.execute(new int[] { 1, 2 }, 3);
        System.out.println(qtd);
    }

}
