import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strings, int n) {
        int strLength = strings.length;        

        Set<Character> cSet = new HashSet<>();
        for (int i=0; i < strLength; i++) {
            cSet.add(strings[i].charAt(n));
        }

        List<Character> cList = cSet.stream()
            .sorted()
            .collect(Collectors.toList());

        List<String> words = new ArrayList<>();
        for (char c : cList) {
            List<String> overlap = new ArrayList<>();
            for (String str : strings) {
                if (c == str.charAt(n)) {
                    overlap.add(str);
                }
            }

            if (overlap.size() > 1) {
                Collections.sort(overlap);
                for (String word : overlap) words.add(word);
            } else words.add(overlap.get(0));
            
        }
        
        return words.toArray(new String[words.size()]);
    }
}