package section7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 7-13 경로탐색(인접리스트, ArrayList)
public class RouteNavigationList {

    static int n, m, answer = 0;
    static List<List<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        RouteNavigationList T = new RouteNavigationList();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        T.DFS(1);

        System.out.println(answer);
    }
}