package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 9-3 결혼식
public class Wedding {

    static class Time implements Comparable<Time> {

        public int time;
        public char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time ob) {
            if (this.time == ob.time) {
                return this.state - ob.state;
            }
            return this.time - ob.time;
        }
    }

    public int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;

        Collections.sort(arr);
        int cnt = 0;

        for (Time ob : arr) {
            if (ob.state == 's') {
                cnt++;
            }
            else cnt--;

            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Wedding T = new Wedding();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int st = kb.nextInt();
            int et = kb.nextInt();
            arr.add(new Time(st, 's'));
            arr.add(new Time(et, 'e'));
        }

        System.out.println(T.solution(arr));
    }
}
