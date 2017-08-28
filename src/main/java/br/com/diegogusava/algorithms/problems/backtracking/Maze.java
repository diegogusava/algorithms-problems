package br.com.diegogusava.algorithms.problems.backtracking;

public class Maze {

    public static final int BLOCK = -1;
    public static final int OPEN = 0;
    public static final int EXIT = Integer.MAX_VALUE;
    private int[][] maze;
    private int mazeSize;
    private int[][] solution;

    public Maze(int[][] maze) {
        this.maze = maze;
        this.mazeSize = maze.length;
        this.solution = new int[mazeSize][mazeSize];
    }

    public int[][] execute(int startX, int startY) {

        if (solve(startX, startY)) {
            return solution;
        }

        return new int[0][0];
    }

    private boolean solve(int currX, int currY) {

        solution[currX][currY] = 1;

        //Maze Exit
        if (maze[currX][currY] == EXIT) {
            return true;
        }

        int[][] moves = moves(currX, currY);

        for (int i = 0; i < moves.length; i++) {
            final int[] move = moves[i];
            final int nextX = move[0];
            final int nextY = move[1];
            if (canWalk(nextX, nextY)) {
                if (solve(nextX, nextY)) {
                    return true;
                }
            }
        }

        solution[currX][currY] = OPEN;

        return false;
    }

    private boolean canWalk(int currX, int currY) {

        if (currX < 0 || currX >= mazeSize) {
            return false;
        }

        if (currY < 0 || currY >= mazeSize) {
            return false;
        }

        //Move to a block
        if (maze[currX][currY] == BLOCK) {
            return false;
        }

        //Already visited
        if (solution[currX][currY] == 1) {
            return false;
        }

        return true;
    }

    public int[][] moves(int currX, int currY) {
        final int[] right = walkRight(currX, currY);
        final int[] left = walkLeft(currX, currY);
        final int[] up = walkUp(currX, currY);
        final int[] down = walkDown(currX, currY);
        return new int[][]{right, left, up, down};
    }

    public int[] walkRight(int currX, int currY) {
        return new int[]{currX + 1, currY};
    }

    public int[] walkLeft(int currX, int currY) {
        return new int[]{currX - 1, currY};
    }

    public int[] walkUp(int currX, int currY) {
        return new int[]{currX, currY - 1};
    }

    public int[] walkDown(int currX, int currY) {
        return new int[]{currX, currY + 1};
    }

}