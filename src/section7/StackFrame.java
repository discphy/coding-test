package section7;

// 7-1 재귀함수(스택프레임)
public class StackFrame {

    public void DFS(int n) {
        if (n == 0) return;

        DFS(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        StackFrame T = new StackFrame();
        T.DFS(3);
    }
}