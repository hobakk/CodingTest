class Solution {
    public long solution(int a, int b) {
        if (a == b) return a;

        int min;
        int max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        long answer = 0;
        while(min <= max) {
            answer += (long) min;
            min++;
        }
        
        return answer;
    }
}