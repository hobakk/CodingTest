import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) numList.add(arr[i]);
        }

        Collections.sort(numList);
        if (numList.size() == 0) numList.add(-1);
        
        return numList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}