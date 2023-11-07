class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();        

        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        int power = 0;
        for (int i=sb.length() -1; i >= 0; i--) {
            int num = Character.getNumericValue(sb.charAt(i));
            answer += num * Math.pow(3, power);
            power++;
        }

        return answer;
    }
}