class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        
        for (int i = Math.max(h - 1, 0); i <= Math.min(h + 1, board.length -1); i++) {
			if (i != h && board[i][w].equals(color)) answer++;
			if (i == h) {
				for (int j = Math.max(w - 1, 0); j <= Math.min(w + 1, board.length -1); j++) {
                    if (j != w && board[h][j].equals(color)) answer++;
                }
            }
		}
        
        return answer;
    }
}