import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        int value = 0;
        
        for (int i=0; i < score.length; i++) {
            if (numList.size() == 0) {
                numList.add(score[i]);
                value = score[i];
            } else {
                numList.add(score[i]);
                numList.sort(Collections.reverseOrder());
                if (numList.size() > k) numList = numList.subList(0, k);
                
                value = numList.get(numList.size() -1);
            }
            
            result.add(value);
        }
        
        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}