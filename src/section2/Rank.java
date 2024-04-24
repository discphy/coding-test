package section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rank {

    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    cnt++;
                }
            }

            answer.add(cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Rank T = new Rank();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (Integer i : T.solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
