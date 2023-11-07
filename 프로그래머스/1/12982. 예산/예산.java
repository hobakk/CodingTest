import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        for (int i=0; i < d.length; i++) {
            if (budget < d[i]) return i;
            budget -= d[i];
        }
        
        return d.length;
    }
}