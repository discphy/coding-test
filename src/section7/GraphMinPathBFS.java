package section7;

import java.util.*;

// 7-14 그래프 최단거리(BFS)

/**
 * 6 9
 * 1 3
 * 1 4
 * 2 1
 * 2 5
 * 3 4
 * 4 5
 * 4 6
 * 6 2
 * 6 5
 */
public class GraphMinPathBFS {

    static List<List<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphMinPathBFS T = new GraphMinPathBFS();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}