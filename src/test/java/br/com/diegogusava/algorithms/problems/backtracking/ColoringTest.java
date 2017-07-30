package br.com.diegogusava.algorithms.problems.backtracking;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColoringTest {


    @Test
    public void colorWithTwo() throws Exception {
        int[][] matrix = new int[][]{
                {0, 1},
                {1, 0}
        };
        Coloring coloring = new Coloring(matrix, 2);
        final int[] execute = coloring.execute();
        assertEquals(2, execute.length);
    }

    @Test
    public void colorWithOneColor() throws Exception {
        int[][] matrix = new int[][]{
                {0, 1},
                {1, 0}
        };
        Coloring coloring = new Coloring(matrix, 1);
        final int[] execute = coloring.execute();
        assertEquals(0, execute.length);
    }

    // a ------------b----
    // |             |   |
    // |------c------|   e
    // |             |   |
    // d-------------f----
    @Test
    public void colorWithFour() {
        //       0, 1, 2, 3, 4, 5
        //       a, b, c, d, e, f
        final int[][] matrix = {
                {0, 1, 1, 1, 0, 0},  //a
                {1, 0, 1, 0, 1, 1},  //b
                {1, 1, 0, 1, 0, 1},  //c
                {1, 0, 1, 0, 0, 1},  //d
                {0, 1, 0, 0, 0, 1},  //e
                {0, 1, 1, 1, 1, 0}   //f
        };

        Coloring coloring = new Coloring(matrix, 4);
        final int[] colors = coloring.execute();
        for (int i = 0; i < matrix.length; i++) {
            char letter = (char) (i + 65);
            System.out.println("Vertex " + letter + " - color: " + colors[i]);
        }
    }

}