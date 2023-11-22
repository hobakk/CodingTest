import java.util.*;

class Solution {
    public int solution(String dartResult) {
		List<Integer> list = new ArrayList<>();
		for (int i=0; i < dartResult.length(); i++) {
			if (Character.isDigit(dartResult.charAt(i))) {
				int num = Character.getNumericValue(dartResult.charAt(i));
                
                if (num == 1 && Character.isDigit(dartResult.charAt(i + 1))) {
                    num = 10;
                    i++;
                }
                
                if (num != 1) {
                    switch (Character.toString(dartResult.charAt(i + 1))) {
                        case "D": num = num * num; break;
                        case "T": num = num * num * num; break;
                        default: break;
                    }
                }
				
				list.add(num);
				i++;
			} else {
				char c = dartResult.charAt(i);
				if (c == '*') {
					list.set(list.size() -1, list.get(list.size() -1) * 2);
					if (list.size() - 2 >= 0) list.set(list.size() -2, list.get(list.size() - 2) * 2);
				} else if (c == '#'){
					list.set(list.size() -1, list.get(list.size() -1) * -1);
				}
			}
		}

		return list.stream().mapToInt(Integer::intValue).sum();
	}
}