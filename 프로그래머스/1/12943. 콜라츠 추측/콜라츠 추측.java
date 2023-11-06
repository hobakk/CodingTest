class Solution {
    public int solution(int num) {
        if (num == 1) return 0;
        int count = 0;
        
        while(num != 1) {
            count++;
            if (count >= 500) return -1;

            if (num % 2 == 0) {
                num /= 2;
            } else {
                long result = (long) num * 3 + 1;
                if (result > Integer.MAX_VALUE) return -1;
                num = (int) result;
            }
        }

        return count;
    }
}