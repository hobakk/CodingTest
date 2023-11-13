class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int count = 0;
		int zero = 0;

		for (int lotto : lottos) {
			if (lotto == 0) {
				zero++;
				continue;
			}

			for (int winNum : win_nums) {
				if (winNum == lotto) {
                    count++;
                    break;
                }
			}
		}

		for (int j=0; j < 2; j++) {
			int index = count;
			if (j == 0) index += zero;

			switch(index) {
				case 6: answer[j] = 1; break;
				case 5: answer[j] = 2; break;
				case 4: answer[j] = 3; break;
				case 3: answer[j] = 4; break;
				case 2: answer[j] = 5; break;
				default: answer[j] = 6;
			}
		}

		return answer;
	}
}