class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
        if (x * x == n) {
            x++;
            return x * x;
        } else return -1;
    }
}