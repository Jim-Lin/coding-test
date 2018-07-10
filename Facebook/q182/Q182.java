public class Q182 {

    public static void main(String args[]) {
        int[][] graph1 = {
            {0, 1, 0, 0, 0, 0},
            {1, 0, 1, 0, 0, 1},
            {0, 1, 0, 1, 1, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 1},
            {0, 1, 0, 0, 1, 0}
        };
        boolean[] reached1 = new boolean[graph1.length];
        System.out.println(q182(graph1, reached1, 0, -1));

        int[][] graph2 = {
            {0, 1, 0, 0, 0, 0},
            {1, 0, 1, 0, 0, 1},
            {0, 1, 0, 1, 1, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0}
        };
        boolean[] reached2 = new boolean[graph2.length];
        System.out.println(q182(graph2, reached2, 0, -1));
    }

    private static boolean q182(int[][] graph, boolean[] reached, int start, int parent) {
        reached[start] = true;

        for (int i = 0; i < graph.length; i++) {
            if (graph[start][i] != 0) {
                if (reached[i]) {
                    if (i != parent) {
                        return false;
                    }
                } else {
                    if (!q182(graph, reached, i, start)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
