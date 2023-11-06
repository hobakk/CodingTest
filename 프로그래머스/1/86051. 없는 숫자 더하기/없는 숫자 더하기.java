import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] numbers) { 
        return Stream.of(1,2,3,4,5,6,7,8,9)
            .filter(num -> Arrays.stream(numbers).noneMatch(i -> num == i))
            .mapToInt(Integer::intValue)
			.sum();
    }
}