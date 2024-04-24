package section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePrimeNumber {

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;

            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }

            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }

    private boolean isPrime(int res) {
        if (res == 1) return false;

        for (int i = 2; i < res; i++) {
            if (res % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ReversePrimeNumber T = new ReversePrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
