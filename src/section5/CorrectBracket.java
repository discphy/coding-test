package section5;

import java.util.*;

public class CorrectBracket {

    public String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        CorrectBracket T = new CorrectBracket();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.print(T.solution(str));
    }
}