import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
		List<String> list = Arrays.asList(players);
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
		for (String calling : callings) {
			int target = map.get(calling);
            String player = list.get(target -1);
			Collections.swap(list, target - 1, target);
            map.put(calling, map.get(calling) -1);
            map.put(player, map.get(player) + 1);
		}

		return list.toArray(String[]::new);
	}
}