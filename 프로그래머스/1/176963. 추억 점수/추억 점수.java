import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        int[] result = new int[photos.length];
        for (int i=0; i < photos.length; i++) {
			result[i] = Arrays.stream(photos[i])
				.filter(p -> Arrays.asList(name).contains(p))
				.map(p -> {
					int index = 0;
					for (int j=0; j < name.length; j++) {
						if (name[j].equals(p)) {
							index = j;
							break;
						}
					}

					return yearning[index];
				})
				.mapToInt(Integer::intValue)
				.sum();
		}
            
        return result;
    }
}