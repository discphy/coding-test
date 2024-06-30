package section7;

// 7-2 이진수 출력(재귀)
public class RecursiveFunction {

    public void DFS(int n) {
        if (n == 0) return;

        DFS(n / 2);
        System.out.print(n % 2 + " ");
    }

    public static void main(String[] args) {
        RecursiveFunction T = new RecursiveFunction();
        T.DFS(11);
    }
}