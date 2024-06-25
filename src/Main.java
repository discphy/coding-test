import java.util.*;

public class Main {

  public List<Point> solution(List<Point> list) {
    	return list;
  }

  public static class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) {
     	this.x = x;
      	this.y = y;
    }

    @Override
    public int compareTo(Point o) {
     	if (x == o.x) {
         	return y - o.y;
        } else {
         	return x - o.x;
        }
    }

  }

  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();

    List<Point> list = new ArrayList<>();

    for (int i = 0; i < input1; i++) {
     	list.add(new Point(in.nextInt(), in.nextInt())) ;
    }

    Collections.sort(list);

    for (Point p : T.solution(list)) {
     	System.out.println(p.x + " " + p.y);
    }
  }
}