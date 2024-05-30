package section5;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {

    public int solution(String text) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();

                if (text.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        IronBar T = new IronBar();
        Scanner in = new Scanner(System.in);
        String text = in.next();

        System.out.print(T.solution(text));
    }
}