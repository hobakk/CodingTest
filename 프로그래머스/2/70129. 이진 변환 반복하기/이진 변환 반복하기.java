class Solution {
    public int[] solution(String s) {
		int[] answer = new int[2];
		StringBuilder sb = new StringBuilder();
        
		while (!s.equals("1")) {
            int sLength = s.length();
			s = s.replaceAll("0", "");
			answer[1] += sLength - s.length();
			sLength = s.length();

			while (sLength > 0) {
				sb.insert(0, sLength % 2);
				sLength /= 2;
			}
			
			s = sb.toString();
            sb.setLength(0);
			answer[0]++;
		}

		return answer;
	}
}