import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        int length = citations.length;

        for (int i = length - 1; i >= 0; i--) {
            int minCitations = Math.min(citations[i], length - i); 
            hIndex = Math.max(hIndex, minCitations);
        }

        return hIndex;
    }
}