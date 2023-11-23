import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
        }
        
        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);
        
        List<Integer> result = new ArrayList<>();
        for (int i=0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            int type = map.get(privacies[i].split(" ")[1]) * 28;
            
            int value = (year - Integer.parseInt(date.split("\\.")[0])) * 28 * 12
                    + (month - Integer.parseInt(date.split("\\.")[1])) * 28
                    + (day - Integer.parseInt(date.split("\\.")[2]));
            
            if (value >= type) result.add(i + 1);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}