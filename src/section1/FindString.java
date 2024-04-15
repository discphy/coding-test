package section1;

import java.util.Scanner;

public class FindString {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindString T = new FindString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char t = kb.next().charAt(0);

        System.out.println(T.solution(str, t));
    }
}
