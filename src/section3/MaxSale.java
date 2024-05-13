package section3;

import java.util.Scanner;

public class MaxSale {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        for (int i = 0; i < m; i++) {
            answer += arr[i];
        }

        int sum = answer;

        for (int i = m; i < n; i++) {
            sum = sum - arr[i - m] + arr[i];

            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxSale T = new MaxSale();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}
