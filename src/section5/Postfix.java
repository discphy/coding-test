package section5;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public int solution(String text) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                Integer rt = stack.pop();
                Integer lt = stack.pop();

                if (c == '+') {
                    stack.push(lt + rt);
                } else if (c == '-') {
                    stack.push(lt - rt);
                } else if (c == '*') {
                    stack.push(lt * rt);
                } else if (c == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        answer = stack.pop();

        return answer;
    }

    public static void main(String[] args) {
        Postfix T = new Postfix();
        Scanner in = new Scanner(System.in);
        String text = in.next();


        System.out.print(T.solution(text));
    }
}