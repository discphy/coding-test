import java.util.*;

public class Main {

  public int solution(int n, int m, int[] arr) {
   	int answer = 0;

    Queue<Person> queue = new LinkedList<>();

    for (int i = 0; i < n; i++) {
     	queue.offer(new Person(i, arr[i]));
    }


    while (!queue.isEmpty()) {
     	Person temp = queue.poll();

      	for (Person p : queue) {
         	if (p.priority > temp.priority) {
             	queue.offer(temp);
              	temp = null;
              	break;
            }
        }

      	if (temp != null) {
         	answer++;
          	if (temp.id == m) return answer;
        }
    }



    return answer;
  }

  public class Person {
   	public int id;
    public int priority;

    public Person(int id, int priority) {
     	this.id = id;
      	this.priority = priority;
    }
  }

  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    int input2 = in.nextInt();
    int arr1[] = new int[input1];

    for (int i = 0; i < input1; i++) {
     	arr1[i] = in.nextInt();
    }

    System.out.println(T.solution(input1, input2, arr1));
    return ;
  }
}