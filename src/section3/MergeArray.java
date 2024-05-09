package section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeArray {

    public List<Integer> solution(int n, int m, int[] arr, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr[p1] < arr2[p2]) {
                answer.add(arr[p1]);
                p1++;
            } else if (arr[p1] > arr2[p2]) {
                answer.add(arr2[p2]);
                p2++;
            } else {
                answer.add(arr[p1]);
                answer.add(arr2[p2]);
                p1++;
                p2++;
            }
        }

        if (p1 < n) {
            for (int i = p1; i < n; i++) {
                answer.add(arr[i]);
            }
        }

        if (p2 < m) {
            for (int i = p2; i < m; i++) {
                answer.add(arr2[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MergeArray T = new MergeArray();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }

        for (int i : T.solution(n, m, arr, arr2)) {
            System.out.print(i + " ");
        }
    }
}
