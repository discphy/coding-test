package section9;

import java.util.*;

// 9-8 원더랜드 (최소 스패닝 트리 - 프림 : PriorityQueue)
public class WonderLandPriorityQueue {

    static class Edge implements Comparable<Edge> {

        public int vex;
        public int cost;

        public Edge(int v, int cost) {
            this.vex = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) {
        WonderLandPriorityQueue T = new WonderLandPriorityQueue();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }

        int answer = 0;

        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));

        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int ev = tmp.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer+= tmp.cost;
                for (Edge edge : graph.get(ev)) {
                    if (ch[edge.vex] == 0) {
                        pQ.offer(new Edge(edge.vex, edge.cost));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
