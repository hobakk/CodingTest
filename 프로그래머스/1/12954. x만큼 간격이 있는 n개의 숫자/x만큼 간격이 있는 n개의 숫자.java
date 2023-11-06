import java.util.ArrayList;
import java.util.List;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> numList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numList.add((long) x * (i + 1));
        }

        return numList.stream()
            .mapToLong(num -> (long) num)
            .toArray();
    }
}