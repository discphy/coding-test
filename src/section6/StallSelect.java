package section6;

import java.util.Arrays;
import java.util.Scanner;

// 6-10 마구간 정하기
public class StallSelect {

    public int count(int[] arr, int capacity) {
        int cnt = 1, ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= capacity) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StallSelect T = new StallSelect();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}