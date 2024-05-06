import java.util.*;

public class Main {

  public List<Integer> solution(int n, int[] arr) {
    List<Integer> answer = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int tmp = arr[i];
      int res = 0;

      while (tmp > 0) {
		int t = tmp % 10;
        res = res * 10 + t;
        tmp /= 10;
      }

      if (isPrime(res)) {
       	answer.add(res);
      }
    }

    return answer;
  }

  private boolean isPrime(int res) {
   	if (res == 1) return false;

    for (int i = 2; i < res; i++) {
     	if (res % i == 0) {
         	return false;
        }
    }

    return true;
  }

  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
	int[] arr = new int[input1];

    for (int i = 0; i < input1; i++) {
     	arr[i] = in.nextInt();
    }

	for (int a : T.solution(input1, arr)) {
     	System.out.print(a + " ");
    }
  }
}