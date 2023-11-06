import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        double answer = Arrays.stream(arr)
            .mapToDouble(num -> (double) num)
            .sum();
        return answer / arr.length;
    }
}