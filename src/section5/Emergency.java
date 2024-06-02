package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Emergency {

    public static class Person {

        private final int id;
        private final int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }

    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person p : queue) {
                if (p.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Emergency T = new Emergency();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(n, m, arr));
    }
}