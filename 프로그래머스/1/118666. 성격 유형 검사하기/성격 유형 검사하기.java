import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
		Map<String, Integer> map = new HashMap<>();
		map.put("R" ,0);
		map.put("T" ,0);
		map.put("C" ,0);
		map.put("F" ,0);
		map.put("J" ,0);
		map.put("M" ,0);
		map.put("A" ,0);
		map.put("N" ,0);

		String key;
		for (int i=0; i < survey.length; i++) {
			switch(choices[i]) {
				case 1: key = Character.toString(survey[i].charAt(0)); map.put(key, map.get(key) + 3); break;
				case 2: key = Character.toString(survey[i].charAt(0)); map.put(key, map.get(key) + 2); break;
				case 3: key = Character.toString(survey[i].charAt(0)); map.put(key, map.get(key) + 1); break;
				case 5: key = Character.toString(survey[i].charAt(1)); map.put(key, map.get(key) + 1); break;
				case 6: key = Character.toString(survey[i].charAt(1)); map.put(key, map.get(key) + 2); break;
				case 7: key = Character.toString(survey[i].charAt(1)); map.put(key, map.get(key) + 3); break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if (map.get("R") >= map.get("T")) sb.append("R");
		else sb.append("T");
		if (map.get("C") >= map.get("F")) sb.append("C");
		else sb.append("F");
		if (map.get("J") >= map.get("M")) sb.append("J");
		else sb.append("M");
		if (map.get("A") >= map.get("N")) sb.append("A");
		else sb.append("N");

		return sb.toString();
	}
}