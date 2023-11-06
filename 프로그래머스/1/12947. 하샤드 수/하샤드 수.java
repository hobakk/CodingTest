import java.util.*;

class Solution {
    public boolean solution(int x) {
        String xStr = String.valueOf(x);
        
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < xStr.length(); i++) {
            numList.add(Character.getNumericValue(xStr.charAt(i)));
        }

        int sum = numList.stream()
            .mapToInt(num -> (int) num)
            .sum();
        return x % sum == 0 ? true : false;
    }
}