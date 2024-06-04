package section6;

import java.util.Scanner;
import java.util.Stack;

// 6-1 선택정렬
public class SelectedArray {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectedArray T = new SelectedArray();
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