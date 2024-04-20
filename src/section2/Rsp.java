package section2;

import java.util.Scanner;

public class Rsp {

    public String solution(int a, int b) {
        String result = "";

        if (a == b) {
            result = "D";
        } else if (a == 1 && b == 3) {
            result = "A";
        } else if (a == 2 && b == 1) {
            result = "A";
        } else if (a == 3 && b == 2) {
            result = "A";
        } else {
            result = "B";
        }

        return result;
    }

    public static void main(String[] args) {
        Rsp T = new Rsp();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(T.solution(a[i], b[i]));
        }
    }
}
