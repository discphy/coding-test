package section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 6-7 좌표정렬
public class Coordinatesort {

    public List<Point> solution(int n, List<Point> points) {

        return points;
    }

    public static class Point implements Comparable<Point> {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        }
    }

    public static void main(String[] args) {
        Coordinatesort T = new Coordinatesort();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            points.add(new Point(in.nextInt(), in.nextInt()));
        }

        Collections.sort(points);

        for (Point p : T.solution(n, points)) {
            System.out.println(p.x + " " + p.y);
        }
    }
}