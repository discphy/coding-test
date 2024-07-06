package section7;

// 7-5 이진트리순회
public class BinaryTree {

    public static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    Node root;

    public void DFS(Node root) {
        if (root == null) return;

        // 전위순회
//        System.out.print(root.data + " ");
        DFS(root.lt);
        // 중위순회
//        System.out.print(root.data + " ");
        DFS(root.rt);
        // 후위순회
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree T = new BinaryTree();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.DFS(T.root);
    }
}