import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;

                for (int k = 0; k < m; k++) {
                    int pi = 0;
                    int pj = 0;

                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) {
                            pi = l;
                        }

                        if (arr[k][l] == j) {
                            pj = l;
                        }
                    }
                    if (pi > pj) {
                        count++;
                    }
                }

                if (count == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[][] arr = new int[input2][input1];

        for (int i = 0; i < input2; i++) {
            for (int j = 0; j < input1; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(T.solution(input1, input2, arr));
        return;
    }
}