import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int i=0; i < speeds.length; i++) {
			while (progresses[i] < 100) {
				count++;
				progresses[i] += speeds[i];
			}

			map.put(i, count);
			count = 0;
		}

		List<Integer> numbers = new ArrayList<>();
		int date = 0;

		for (int num : map.values()) {
			if (date == 0) date = num;
			else if (date >= num) count++;
			else {
				numbers.add(count + 1);
				count = 0;
                date = num;
			}
		}
        
        if (date > 0) numbers.add(count + 1);

		return numbers.stream().mapToInt(Integer::intValue).toArray();
	}
}