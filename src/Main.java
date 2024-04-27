import java.util.Scanner;

public class Main {

  public String solution(int cnt, String str) {
    String answer = "";

	for (int i = 0; i < cnt; i++) {
     	String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");

      	answer += (char) Integer.parseInt(tmp, 2);

        str = str.substring(7);
    }

      return answer;
  }

  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    String input2 = in.next();

    System.out.println(main.solution(input1, input2));
    return ;
  }
}