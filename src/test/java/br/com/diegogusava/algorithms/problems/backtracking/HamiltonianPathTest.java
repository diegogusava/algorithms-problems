package br.com.diegogusava.algorithms.problems.backtracking;

import org.junit.Test;

public class HamiltonianPathTest {
    @Test
    public void get() throws Exception {

        //       0, 1, 2, 3, 4, 5
        //       a, b, c, d, e, f
        final HamiltonianPath hamiltonianPath = new HamiltonianPath(new int[][]{
                {0, 1, 1, 1, 0, 0},  //a
                {1, 0, 1, 0, 1, 1},  //b
                {1, 1, 0, 1, 0, 1},  //c
                {1, 0, 1, 0, 0, 1},  //d
                {0, 1, 0, 0, 0, 1},  //e
                {0, 1, 1, 1, 1, 0}   //f
        });

        char[] values = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};

        final Integer[] path = hamiltonianPath.get(2);
        System.out.println("--------------");
        for (Integer integer : path) {
            System.out.print(values[integer] + " -> ");
        }

    }

}