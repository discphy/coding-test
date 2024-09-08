package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 9-4 최대수입스케줄
public class MaxIncomeSchedule {

    static class Lecture implements Comparable<Lecture> {

        public int money;
        public int date;


        public Lecture(int money, int date) {
            this.money = money;
            this.date = date;
        }

        @Override
        public int compareTo(Lecture ob) {
            return ob.date - this.date;
        }
    }

    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).date < i) {
                    break;
                }
                pQ.offer(arr.get(j).money);
            }

            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxIncomeSchedule T = new MaxIncomeSchedule();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) max = d;
        }

        System.out.println(T.solution(arr));
    }
}