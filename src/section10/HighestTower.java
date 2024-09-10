package section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 10-4 가장 높은 탑 쌓기(LIS 응용)
public class HighestTower {

    static int[] dy;

    static class Brick implements Comparable<Brick> {
        public int s;
        public int h;
        public int w;

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick o) {
            return o.s - this.s;
        }
    }

    public int solution(ArrayList<Brick> arr) {
        Collections.sort(arr);

        dy[0] = arr.get(0).h;
        int answer = dy[0];

        for (int i = 1; i < arr.size(); i++) {
            int maxH = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(i).w && dy[j] > maxH) {
                    maxH = dy[j];
                }
            }
            dy[i] = maxH + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        HighestTower T = new HighestTower();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Brick(a, b, c));
        }
        System.out.println(T.solution(arr));
    }
}
