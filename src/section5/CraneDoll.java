package section5;

import java.util.Scanner;
import java.util.Stack;

public class CraneDoll {

    public int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            int pos = moves[i] - 1;

            for (int j = 0; j < n; j++) {
                int value = arr[j][pos];

                if (value != 0) {
                    if (!stack.isEmpty() && stack.peek() == value) {
                        stack.pop();
                        answer = answer + 2;
                    } else {
                        stack.push(value);
                    }

                    arr[j][pos] = 0;

                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CraneDoll T = new CraneDoll();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.print(T.solution(n, arr, m, moves));
    }
}