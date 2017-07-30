package br.com.diegogusava.algorithms.problems.backtracking;

import org.junit.Test;

public class KnightTest {

    @Test
    public void solution() throws Exception {

        final Knight knight = new Knight(5);

        final int[][] solution = knight.solution(0, 0);

        if (solution.length == 0) {
            System.out.println("Not Found");
        }

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution.length; j++) {
                final int result = solution[i][j];
                if (result <= 9) {
                    System.out.print(solution[i][j] + "   ");
                } else {
                    System.out.print(solution[i][j] + "  ");
                }

            }
            System.out.println();
        }

    }

}