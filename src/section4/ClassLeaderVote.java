package section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassLeaderVote {

    public char solution(int n, String str) {
        char answer = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                answer = c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ClassLeaderVote T = new ClassLeaderVote();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String str = in.next();

        System.out.print(T.solution(input1, str));
    }
}