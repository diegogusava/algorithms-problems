package br.com.diegogusava.algorithms.problems.backtracking;

public class NQueens {

    private int[][] table;
    private int len;


    public NQueens(int len) {
        table = new int[len][len];
        this.len = len;
    }

    public boolean execute(int columnIndex) {

        if (columnIndex == len) {
            return true;
        }

        for (int i = 0; i < len; i++) {

            if (isPlaceValid(i, columnIndex)) {

                table[i][columnIndex] = 1;

                if (execute(columnIndex++)) {
                    return true;
                }

                table[i][columnIndex] = 0;
            }

        }

        return false;

    }

    private boolean isPlaceValid(int rowIndex, int columnIndex) {

        for (int i = 0; i < columnIndex; i++) {

            if (table[rowIndex][i] == 1) {
                return false;
            }

        }

        for (int i = rowIndex, j = columnIndex; i >= 0 && j >= 0; i--, j--) {
            if (table[i][j] == 1) {
                return false;
            }

        }

        for (int i = rowIndex, j = columnIndex; i < table.length && j >= 0; i++, j--) {
            if (table[i][j] == 1) {
                return false;
            }

        }

        return false;
    }

}
