package br.com.diegogusava.algorithms.problems.backtracking;

public class HamiltonianPath {

    private Integer[] path;
    private int[][] vertices;
    private int verticesTotal;
    private int verticesCount;
    private int startIndex;
    private boolean[] visited;

    public HamiltonianPath(int[][] vertices) {
        this.vertices = vertices;
        this.path = new Integer[vertices.length];
        ;
        this.visited = new boolean[vertices.length];
        ;
        this.verticesTotal = vertices.length;
    }

    public Integer[] get(int startIndex) {
        this.startIndex = startIndex;

        if (execute(startIndex)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        return path;
    }

    private boolean execute(int vertexIndex) {

        path[verticesCount] = vertexIndex;
        verticesCount++;

        if (verticesCount == verticesTotal) {
            if (vertices[vertexIndex][startIndex] == 1) {
                return true;
            } else {
                verticesCount--;
                return false;
            }
        }

        visited[vertexIndex] = true;

        for (int i = 0; i < verticesTotal; i++) {
            if (vertices[vertexIndex][i] == 1 && visited[i] == false) {
                if (execute(i)) {
                    return true;
                }
            }

        }

        visited[vertexIndex] = false;
        verticesCount--;

        return false;
    }
}
