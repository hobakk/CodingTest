class Solution {
    public int solution(String[] babbling) {
		String[] talk = {"aya", "ye", "woo", "ma"};
		int answer = 0;
		for (String word : babbling) {
			for (int j=0; j < talk.length; j++) {
                String overlap = talk[j] + talk[j];
                word = word.replaceAll(overlap, "1");
				word = word.replaceAll(talk[j], " ");
			}

            word = word.replaceAll(" ", "");
			if (word.isEmpty()) answer++;
		}
		return answer;
	}
}