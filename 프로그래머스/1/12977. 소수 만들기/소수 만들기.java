class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i=0; i < nums.length; i++) {
            if (i == nums.length - 2) break;
            for (int j=i+1; j < nums.length; j++) {
                for (int x=j+1; x < nums.length; x++) {
                    int result = nums[i] + nums[j] + nums[x];
                    if (isPrime(result)) answer++;
                }
            }
        }


        return answer;
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}