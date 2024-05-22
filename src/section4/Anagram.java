package section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public String solution(String str, String str1) {
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) != 0) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Anagram T = new Anagram();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str1 = in.next();

        System.out.print(T.solution(str, str1));
    }
}