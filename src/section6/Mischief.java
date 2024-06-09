package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 6-6 장난꾸러기
public class Mischief {

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int[] tmp = arr.clone();

        Arrays.sort(tmp);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Mischief T = new Mischief();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}