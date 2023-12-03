import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		Map<String, Integer> map = new HashMap<>();
		for (int i=0; i < want.length; i++) {
			map.put(want[i], number[i]);
		}

		for (int i=0; i < discount.length; i++) {
			boolean b = true;
			Map<String, Integer> copy = new HashMap<>(map);
			for (int j=i; j < Math.min(i + 10, discount.length); j++) {
				int value = copy.getOrDefault(discount[j], 0);
				if (value > 0) copy.put(discount[j], copy.get(discount[j]) -1);
			}

			for (int num : copy.values()) {
				if (num > 0) {
					b = false;
					break;
				}
			}

			if (b) answer++;
		}

		return answer;
	}
}