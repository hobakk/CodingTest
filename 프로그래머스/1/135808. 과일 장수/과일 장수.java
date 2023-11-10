import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int sLength = score.length;
        List<Integer> apples = Arrays.stream(score)
			.boxed()
			.sorted()
			.collect(Collectors.toList());
        
        if (sLength % m > 0) apples = apples.subList(sLength % m, sLength);
        
        for (int i=0; i < sLength; i+=m) {
            if (i == apples.size()) break;
            answer += apples.get(i) * m;
        }

        return answer;
    }
}