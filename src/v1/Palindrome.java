package v1;

import java.util.Scanner;

public class Palindrome {

    public String solution(String str) {
        str = str.toUpperCase();

        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return "NO";
            }
        }

        return "YES";
    }

    public String solution2(String str) {
        String tmp = new StringBuilder(str).reverse().toString();

        if (!str.equalsIgnoreCase(tmp)) {
            return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Palindrome T = new Palindrome();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution2(str));
    }
}
