import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i < words.length; i++) {
            if (i == 0) {
                map.put(words[i], 1);
                continue;
            }
            
            char previous = words[i - 1].charAt(words[i - 1].length() -1);
            if (previous == words[i].charAt(0) && map.getOrDefault(words[i], 0) == 0) {
                map.put(words[i], 1);
            } else {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }

        return answer;
    }
}