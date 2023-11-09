import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numSet = new HashSet<>();
        int count = -1;
        
        for (int num : numbers) {
            count++;
            for (int i=0; i < numbers.length; i++) {
                if (i == count) continue;
                numSet.add(num + numbers[i]);
            }
        }
        
        return numSet.stream()
				.mapToInt(Integer::intValue)
				.sorted()
				.toArray();
    }
}