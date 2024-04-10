package v1;

import java.util.Scanner;

public class ValidPalindrome {

    public String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        if (new StringBuilder(str).reverse().toString().equals(str)) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        ValidPalindrome T = new ValidPalindrome();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}
