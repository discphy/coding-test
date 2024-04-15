package section1;

import java.util.Scanner;

public class ExtractNumber {

    public int solution(String str) {
        int answer = 0;

        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }

    public int solution2(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        ExtractNumber T = new ExtractNumber();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution2(str));
    }
}
