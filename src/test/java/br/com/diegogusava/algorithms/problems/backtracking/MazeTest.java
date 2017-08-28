package br.com.diegogusava.algorithms.problems.backtracking;

import org.junit.Test;

import static br.com.diegogusava.algorithms.problems.backtracking.Maze.BLOCK;
import static br.com.diegogusava.algorithms.problems.backtracking.Maze.EXIT;
import static br.com.diegogusava.algorithms.problems.backtracking.Maze.OPEN;

public class MazeTest {


    @Test
    public void execute() throws Exception {

        final int[][] matrix = {
                {OPEN, OPEN, BLOCK, BLOCK, BLOCK},
                {BLOCK, OPEN, BLOCK, BLOCK, BLOCK},
                {OPEN, OPEN, BLOCK, BLOCK, BLOCK},
                {OPEN, BLOCK, OPEN, OPEN, OPEN},
                {OPEN, OPEN, OPEN, BLOCK, EXIT},
        };

        Maze maze = new Maze(matrix);

        final int[][] result = maze.execute(0, 0);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

                if (result[i][j] == 1) {
                    System.out.print(" S ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

    }

}