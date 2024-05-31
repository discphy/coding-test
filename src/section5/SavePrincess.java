package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {

    public int solution(int n, int m) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < m; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();

            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SavePrincess T = new SavePrincess();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.print(T.solution(n, m));
    }
}