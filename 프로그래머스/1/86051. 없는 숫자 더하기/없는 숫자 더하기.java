import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> numList = Arrays.stream(numbers)
            .boxed()
            .collect(Collectors.toList());
        
        return Stream.of(1,2,3,4,5,6,7,8,9)
            .filter(num -> !numList.contains(num))
            .mapToInt(Integer::intValue)
            .sum();
    }
}