import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[i][j] <= arr[nx][ny]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) { answer++; }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[][] arr = new int[input1][input1];

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(T.solution(input1, arr));
        return;
    }
}