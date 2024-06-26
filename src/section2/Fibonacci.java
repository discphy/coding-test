package section2;

import java.util.Scanner;

public class Fibonacci {

    public int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer;
    }

    public void solution2(int n) {
        int a = 1, b = 1, c;

        System.out.println();
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }

        T.solution2(n);
    }
}
