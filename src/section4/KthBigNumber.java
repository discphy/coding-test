package section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthBigNumber {

    public int solution(int a, int b, int[] arr) {
        int answer = -1;

        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                for (int k = j + 1; k < a; k++) {
                    ts.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int cnt = 0;
        for (Integer t : ts) {
            cnt++;
            if (cnt == b) {
                return t;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        KthBigNumber T = new KthBigNumber();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(a, b, arr));
    }
}