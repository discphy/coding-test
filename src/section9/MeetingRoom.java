package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 9-2 회의실 배정
public class MeetingRoom {

    static class Time implements Comparable<Time> {

        public int s, e;

        public Time(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Time o) {
            if (this.e == o.e) {
                return this.s - o.s;
            }
            return this.e - o.e;
        }
    }

    public int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;

        Collections.sort(arr);

        int et = 0;

        for (Time ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        MeetingRoom T = new MeetingRoom();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Time(h, w));
        }

        System.out.println(T.solution(arr, n));
    }
}
