class Solution {
    public int solution(int n) {
		int answer = 0;
		int nLength = getLength(Integer.toBinaryString(n));
        
		while (answer == 0) {
			n++;
			if (nLength == getLength(Integer.toBinaryString(n))) answer = n;
		}
		
		return answer;
	}
    
    private int getLength(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == '1') count++;
		}
		
		return count;
	}
}