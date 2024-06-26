package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class VisibleStudent {

    public int solution(int n, int[] arr) {
        int result = 1;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        VisibleStudent T = new VisibleStudent();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}
