import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> strList = new ArrayList<>();

        int strLength = s.length();
        for (int i = 0; i < strLength; i++) {
            strList.add(Character.toString(s.charAt(i)));
        }
        
        Collections.sort(strList, Collections.reverseOrder());
        return String.join("", strList);
    }
}