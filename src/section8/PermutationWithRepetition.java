package section8;

import java.util.Scanner;

// 8-4 중복순열
public class PermutationWithRepetition {

    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        PermutationWithRepetition T = new PermutationWithRepetition();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        pm = new int[m];
        T.DFS(0);
    }
}
