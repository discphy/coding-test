package section7;

// 7-4 피보나치 재귀(메모이제이션)
public class Fibonacci {

    static int[] fibonacci;

    public int DFS(int n) {
        if (fibonacci[n] > 0) return fibonacci[n];

        if (n == 1) return fibonacci[n] = 1;
        else if (n == 2) return fibonacci[n] = 1;
        else return fibonacci[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();

        int n = 45;
        fibonacci = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}