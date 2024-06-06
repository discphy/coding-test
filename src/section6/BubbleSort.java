package section6;

import java.util.Scanner;

// 6-2 버블정렬
public class BubbleSort {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
        }

        return arr;
    }

    public static void main(String[] args) {
        BubbleSort T = new BubbleSort();
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