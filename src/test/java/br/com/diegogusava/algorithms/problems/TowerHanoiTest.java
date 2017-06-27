package br.com.diegogusava.algorithms.problems;

import org.junit.Test;

import br.com.diegogusava.algorithms.problems.recursion.TowerHanoi;

public class TowerHanoiTest {

    @Test
    public void test() {
        TowerHanoi hanoi = new TowerHanoi();
        hanoi.execute(4, "A", "B", "C");
    }

}
