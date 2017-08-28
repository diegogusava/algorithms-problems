package br.com.diegogusava.algorithms.problems.backtracking;

public class Coloring {

    private int[][] matrix;
    private int verticesTotal;
    private int[] colors;
    private int totalColors;

    public Coloring(int[][] matrix, int totalColors) {
        this.matrix = matrix;
        this.verticesTotal = matrix.length;
        this.colors = new int[matrix.length];
        this.totalColors = totalColors;
    }

    public int[] execute() {

        if (color(0)) {
            return colors;
        }
        return new int[0];
    }

    private boolean color(int vertexIndex) {

        if (vertexIndex == verticesTotal) {
            return true;
        }

        for (int colorIndex = 0; colorIndex < totalColors; colorIndex++) {

            if (applyColor(vertexIndex, colorIndex)) {

                colors[vertexIndex] = colorIndex;
                if (color(vertexIndex + 1)) {
                    return true;
                }

            }

        }

        return false;
    }

    private boolean applyColor(int vertexIndex, int colorIndex) {

        for (int i = 0; i < verticesTotal; i++) {

            if (matrix[vertexIndex][i] == 1 && colors[i] == colorIndex) {
                return false;
            }

        }

        return true;
    }

}
