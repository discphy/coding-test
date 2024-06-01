package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DesignEducation {

    public static class Person {

        private final int id;
        private final int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public String solution(String need, String plan) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char x : need.toCharArray()) {
            queue.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        DesignEducation T = new DesignEducation();
        Scanner in = new Scanner(System.in);
        String need = in.next();
        String plan = in.next();

        System.out.print(T.solution(need, plan));
    }
}