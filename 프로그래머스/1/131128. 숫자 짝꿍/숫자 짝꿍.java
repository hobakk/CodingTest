import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        String[] Xs = X.split("");
        String[] Ys = Y.split("");

        List<String> words = new ArrayList<>();

        Map<String, Integer> countX = new HashMap<>();
        Map<String, Integer> countY = new HashMap<>();

        for (String x : Xs) {
            if (!x.isEmpty()) countX.put(x, countX.getOrDefault(x, 0) + 1);
        }

        for (String y : Ys) {
            if (!y.isEmpty()) countY.put(y, countY.getOrDefault(y, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countX.entrySet()) {
            String key = entry.getKey();
            int minCount = Math.min(entry.getValue(), countY.getOrDefault(key, 0));

            for (int i = 0; i < minCount; i++) {
                words.add(key);
            }
        }

        if (words.isEmpty()) return "-1";

        Collections.sort(words, Collections.reverseOrder());
        if (words.get(0).equals("0")) return "0";
            
        return words.stream().collect(Collectors.joining());
    }
}