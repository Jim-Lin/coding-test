import java.util.Arrays;

public class Q56 {

    public static void main(String args[]) {
        /* Create following graph and test whether it is
           3 colorable
          (3)---(2)
           |   / |
           |  /  |
           | /   |
          (0)---(1)
        */
        // int k = 3;
        // int[][] graph = {
        //     {0, 1, 1, 1},
        //     {1, 0, 1, 0},
        //     {1, 1, 0, 1},
        //     {1, 0, 1, 0},
        // };

        // int k = 3;
        // int[][] graph = {
        //     {0, 1, 0, 0, 1, 1, 0, 0, 0, 0},
        //     {1, 0, 1, 0, 0, 0, 1, 0, 0, 0},
        //     {0, 1, 0, 1, 0, 0, 0, 1, 0, 0},
        //     {0, 0, 1, 0, 1, 0, 0, 0, 1, 0},
        //     {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
        //     {1, 0, 0, 0, 0, 0, 0, 1, 1, 0},
        //     {0, 1, 0, 0, 0, 0, 0, 0, 1, 1},
        //     {0, 0, 1, 0, 0, 1, 0, 0, 0, 1},
        //     {0, 0, 0, 1, 0, 1, 1, 0, 0, 0},
        //     {0, 0, 0, 0, 1, 0, 1, 1, 0, 0}
        // };

        int k = 4;
        int[][] graph = {
            {1, 0, 0, 1, 0, 1, 1, 0, 1},
            {0, 1, 0, 1, 1, 0, 0, 1, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 1},
            {1, 1, 0, 1, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 1, 1, 1, 1, 0},
            {1, 0, 0, 0, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 1, 0, 1, 1, 1},
            {0, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 0, 1, 1, 1},
        };

        System.out.println(isValid(graph, k));
    }

    private static boolean isValid(int[][] graph, int k) {
        int[] color = new int[graph.length];

        return isGraphValid(graph, k, color, 0);
    }

    private static boolean isGraphValid(int[][] graph, int k, int[] color, int vertex) {
        if (vertex == graph.length) {
            System.out.println(Arrays.toString(color));

            return true;
        }

        for (int i = 1; i <= k; i++) {
            if (isVertexValid(graph[vertex], color, i)) {
                color[vertex] = i;
                if (isGraphValid(graph, k, color, vertex + 1)) {
                    return true;
                }

                color[vertex] = 0;
            }
        }

        return false;
    }

    private static boolean isVertexValid(int[] g, int[] color, int c) {
        for (int i = 0; i < g.length; i++) {
            if (g[i] == 1 && color[i] == c) {
                return false;
            }
        }

        return true;
    }
}
