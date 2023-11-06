class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.replaceAll("p", "P");
        s = s.replaceAll("y", "Y");
        int PCount = countOccurrences(s, 'P');
        int YCount = countOccurrences(s, 'Y');
        
        if (PCount == YCount) return answer;
        else return !answer;
    }
    
    private int countOccurrences(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) count ++;
        }
        
        return count;
    }
}