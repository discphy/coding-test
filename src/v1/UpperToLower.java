package v1;

import java.util.Scanner;

public class UpperToLower {

    public String solution(String str) {
        String answer = "";

        // 소문자 빼기 - 32 = 대문자
        for (char x : str.toCharArray()) {
            /*if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }*/

            if (x >= 97 && x <= 122) { //소문자?
                answer += (char) (x - 32);
            } else {
                answer += (char) (x + 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        UpperToLower T = new UpperToLower();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
