class Solution {
    public String solution(String s) {
		StringBuilder sb = new StringBuilder();
        boolean startWord = true;
		
		for (char c : s.toLowerCase().toCharArray()) {
			if (c == ' ') startWord = true;
            else if (Character.isDigit(c)) startWord = false;
            else if (startWord) {
                sb.append((char) (c - 32));
                startWord = false;
                continue;
            } 
            
            sb.append(c);
		}

		return sb.toString();
	}
}