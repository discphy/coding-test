package section4;

import java.util.*;

public class AllAnagram {

    public int solution(String a, String b) {
        int answer = 0;

        Map<Character, Integer> am =  new HashMap<>();
        Map<Character, Integer> bm =  new HashMap<>();

        for (char c : b.toCharArray()) {
            bm.put(c, bm.getOrDefault(c, 0) + 1);
        }

        char[] aArr = a.toCharArray();

        for (int i = 0; i < b.length() - 1; i++) {
            am.put(aArr[i], am.getOrDefault(aArr[i], 0) + 1);
        }

        int lt = 0;

        for (int rt = b.length() - 1; rt < a.length(); rt++) {
            am.put(aArr[rt], am.getOrDefault(aArr[rt], 0) + 1);

            if (am.equals(bm)) {
                answer++;
            }

            am.put(aArr[lt], am.get(aArr[lt]) - 1);

            if (am.get(aArr[lt]) == 0) {
                am.remove(aArr[lt]);
            }

            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        AllAnagram T = new AllAnagram();
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        System.out.print(T.solution(a, b));
    }
}