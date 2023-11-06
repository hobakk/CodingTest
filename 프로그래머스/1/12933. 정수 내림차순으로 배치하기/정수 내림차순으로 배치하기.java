import java.util.*;

class Solution {
    public long solution(long n) {
        String nStr = Long.toString(n);
        List<String> numList = new ArrayList<>();

        for (int i = 0; i < nStr.length(); i++) {
            numList.add(Character.toString(nStr.charAt(i)));
        }
                        
        Collections.sort(numList, Collections.reverseOrder());
        return Long.parseLong(String.join("", numList));
    }
}