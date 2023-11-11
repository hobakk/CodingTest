import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> numbers = new ArrayList<>();
        
        for (int i=1; i <= number; i++) {
            int divisors = 0;
            for (int j=1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    divisors++;
                    if (j != i / j) divisors++;
                }
            }
            
            numbers.add(divisors);
        }
        
        return numbers.stream()
			.map(num -> {
				if (num > limit) num = power;
				return num;
			})
			.mapToInt(Integer::intValue)
			.sum();
    }
}