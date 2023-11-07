import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> numList = new ArrayList<>();
        int overlap = arr[0];
        numList.add(overlap);
        
        for (int i=1; i < arr.length; i++) {
            if (overlap == arr[i]) continue;
            else {
                overlap = arr[i];
                numList.add(overlap);
            }
        }

        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}