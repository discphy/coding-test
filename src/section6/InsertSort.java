package section6;

import java.util.Scanner;

// 6-3 삽입정렬
public class InsertSort {

    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i], j;

            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }

            arr[j + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertSort T = new InsertSort();
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