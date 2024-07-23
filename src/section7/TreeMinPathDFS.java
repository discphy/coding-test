package section7;

// 7-9 Tree 말단노드까지의 가장 짧은 경로 DFS
public class TreeMinPathDFS {

    public static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    Node root;

    public int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) return L;
        return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        TreeMinPathDFS T = new TreeMinPathDFS();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.DFS(0, T.root));
    }
}