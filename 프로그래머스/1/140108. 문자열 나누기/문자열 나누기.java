class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length();) {
            int first = 1;
            int etc = 0;
            int endPoint = 0;
            char c = s.charAt(i);
            
            for (int j=i+1; j < s.length(); j++) {
                if (c == s.charAt(j)) first++;
                else etc++;
                
                if (first == etc) {
                    answer++;
                    endPoint = j;
                    break;
                }
            }
            
            if (endPoint == 0) {
                answer++;
                break;
            }
            
            i = endPoint + 1;
        }
        
        return answer;
    }
}
