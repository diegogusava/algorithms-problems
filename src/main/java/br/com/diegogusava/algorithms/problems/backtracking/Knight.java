package br.com.diegogusava.algorithms.problems.backtracking;

public class Knight {

    private int[][] matrix;
    private int[] xMoves;
    private int[] yMoves;
    private int boardSize;

    public Knight(int boardSize) {
        this.matrix = new int[boardSize][boardSize];
        this.boardSize = boardSize;
        this.xMoves = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
        this.yMoves = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
    }


    public int[][] solution(int startX, int startY) {

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                matrix[i][j] = Integer.MIN_VALUE;
            }
        }

        if (solution(startX, startY, 0)) {
            return matrix;
        } else {
            return new int[][]{};
        }

    }

    private boolean solution(int currX, int currY, int counter) {

        counter++;
        matrix[currX][currY] = counter;

        if (counter == (boardSize * boardSize)) {
            return true;
        }

        for (int i = 0; i < xMoves.length; i++) {

            int nextX = currX + xMoves[i];
            int nextY = currY + yMoves[i];

            if (isPossible(nextX, nextY)) {
                if (solution(nextX, nextY, counter)) {
                    return true;
                }
            }

        }


        matrix[currX][currY] = Integer.MIN_VALUE;
        counter--;

        return false;

    }

    private boolean isPossible(int nextX, int nextY) {

        //the cell exists on the board
        if (nextX < 0 || nextY < 0 || nextX > boardSize - 1 || nextY > boardSize - 1) {
            return false;
        }

        //the move is already visited
        if (matrix[nextX][nextY] > 0) {
            return false;
        }

        return true;
    }

}

