package section6;

import java.util.Scanner;

// 6-4 Least Recently Used
public class LeastRecentlyUsed {

    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        for (int x : arr) {
            int pos = -1;

            for (int i = 0; i < size; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }

            if (pos == -1) { // miss
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            }

            cache[0] = x;
        }

        return cache;
    }

    public static void main(String[] args) {
        LeastRecentlyUsed T = new LeastRecentlyUsed();
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : T.solution(m, n, arr)) {
            System.out.print(i + " ");
        }
    }
}