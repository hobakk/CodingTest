class Solution {
    public String solution(int a, int b) {
         int[] daysInMonth = {
             0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int days = 0;
        for (int i=1; i < a; i++) {
            days += daysInMonth[i];
        }
        
        days = (days + b -1) % 7;
        String[] result = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        return result[days];
    }
}