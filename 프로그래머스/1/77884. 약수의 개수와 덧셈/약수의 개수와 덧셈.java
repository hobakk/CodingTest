import java.util.*;

class Solution {
    public int solution(int left, int right) {
        List<Integer> base = new ArrayList<>();
        int sum = 0;

        for (int i = left; i <= right; i++) {
            List<Integer> numList = new ArrayList<>(base);
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) numList.add(j);
            }
            
            if (numList.size() % 2 == 0) sum += i;
            else sum -= i;
        }

        return sum;
    }
}