import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int answer = 0;

        int cnt = 1;
        n--;

        while (n > 0) {
            cnt++;
            n -= cnt;

            if (n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        System.out.print(T.solution(input1));
    }
}