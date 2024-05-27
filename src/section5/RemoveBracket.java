package section5;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracket {

    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        for (Character c : stack) {
            answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {
        RemoveBracket T = new RemoveBracket();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.print(T.solution(str));
    }
}