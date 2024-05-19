import java.util.*;

public class Main {

    public List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                p1++;
            } else if (arr1[p1] > arr2[p2]) {
                p2++;
            } else {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr1 = new int[input1];

        for (int i = 0; i < input1; i++) {
            arr1[i] = in.nextInt();
        }

        int input2 = in.nextInt();
        int[] arr2 = new int[input2];

        for (int i = 0; i < input1; i++) {
            arr2[i] = in.nextInt();
        }


        for (int i : T.solution(input1, arr1, input2, arr2)) {
            System.out.print(i + " ");
        }
    }
}