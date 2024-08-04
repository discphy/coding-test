package section8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 8-5 동전교환
public class CoinExchange {

    static Integer[] arr;
    static int n, m;
    static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum) {
        if (sum > m || L >= answer) {
            return;
        }

        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        CoinExchange T = new CoinExchange();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        m = kb.nextInt();

        T.DFS(0, 0);
        System.out.println(answer);
    }
}
