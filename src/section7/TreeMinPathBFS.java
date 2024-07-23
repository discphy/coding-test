package section7;

import java.util.LinkedList;
import java.util.Queue;

// 7-10 Tree 말단노드까지의 가장 짧은 경로 BFS
public class TreeMinPathBFS {

    public static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    Node root;

    public int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);

        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                }
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }

                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }

            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        TreeMinPathBFS T = new TreeMinPathBFS();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.BFS(T.root));
    }
}