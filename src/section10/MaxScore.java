package section10;

import java.util.Scanner;

// 10-6 최대점수 구하기(냅색 알고리즘)
public class MaxScore {

    public static void main(String[] args) {
        MaxScore T = new MaxScore();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] dy = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int ps = kb.nextInt();
            int pt = kb.nextInt();
            for (int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }

        System.out.println(dy[m]);
    }
}
