import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, Set<String>> reports = new HashMap<>();
		Map<String, Integer> map = new HashMap<>();

		for (String str : report) {
			String[] users = str.split(" ");
			String reporter = users[0];
			String target = users[1];
			reports.computeIfAbsent(reporter, key -> new HashSet<>()).add(target);
		}

		for (Map.Entry<String, Set<String>> entry : reports.entrySet()) {
			for (String target : entry.getValue()) {
				map.put(target, map.getOrDefault(target, 0) + 1);
			}
		}

		for (int i=0; i < id_list.length; i++) {
            Set<String> reportedUsers = reports.getOrDefault(id_list[i], Collections.emptySet());
            for (String target : reportedUsers) {
                if (map.getOrDefault(target, 0) >= k) answer[i]++;
            }
        }

		return answer;
	}
}