class Solution {
    public int[] solution(int n, int m) {
        int max = getGCD(n, m);
        int min = (n * m) / max;
        
        int[] answer = {max, min};
        return answer;
    }

    private int getGCD(int a, int b) {
        while(b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}