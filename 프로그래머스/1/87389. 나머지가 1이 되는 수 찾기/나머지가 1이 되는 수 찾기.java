import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        List<Integer> numList = new ArrayList<>();
        for (int x=1; x < n; x++) {
            if (n % x == 1) numList.add(x);
        }
        
        numList.stream().sorted();
        return numList.get(0);
    }
}