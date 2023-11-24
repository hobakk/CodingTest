import java.util.*;

class Solution {
    public int[][] solution(int[][] datas, String ext, int val_ext, String sort_by) {
		int[][] answer = {};
		Map<String, Integer> map = new HashMap<>();
		map.put("code", 0);
		map.put("date", 1);
		map.put("maximum", 2);
		map.put("remain", 3);

		List<String> words = new ArrayList<>();
		for (int[] data : datas) {
			if (data[map.get(ext)] < val_ext) {
				StringBuilder sb = new StringBuilder();
				for (int num : data) {
					sb.append(num).append(" ");
				}

				words.add(sb.toString().trim());
			}
		}

		final int target = map.get(sort_by);
		words.sort((s1, s2) -> {
			int value1 = Integer.parseInt(s1.split(" ")[target]);
			int value2 = Integer.parseInt(s2.split(" ")[target]);
			return Integer.compare(value1, value2);
		});

		return words.stream()
			.map(s -> Arrays.stream(s.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray())
			.toArray(int[][]::new);
	}
}