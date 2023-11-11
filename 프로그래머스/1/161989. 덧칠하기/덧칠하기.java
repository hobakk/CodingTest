class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        for (int i=1; i <= section[section.length -1]; i++) {
            for (int num : section) {
                if (i == num) {
                    answer++;
                    i += (m);
                }
            }
        }
        
        return answer;
    }
}