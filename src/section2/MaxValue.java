package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxValue {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MaxValue T = new MaxValue();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
