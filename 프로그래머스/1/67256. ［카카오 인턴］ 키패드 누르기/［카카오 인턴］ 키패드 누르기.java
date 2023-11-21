class Solution {
    public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int right = -1;
		int left = -1;

		for (int number : numbers) {
			if (number == 1 || number == 4 || number == 7) {
				sb.append("L");
				left = number;
			} else if (number == 3 || number == 6 || number == 9) {
				sb.append("R");
				right = number;
			} else {
				String most = hand.equals("right") ? "R" : "L";
                String str = compare(left, right, number, most);
                if (str.equals("R")) right = number;
                else left = number;
                
                sb.append(str);
			}
		}

		return sb.toString();
	}

	private String compare(int left, int right, int target, String most) {
		int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}, {-1, 0, -1}};
		int[] lPoint = new int[2];
		int[] rPoint = new int[2];
		int[] tPoint = new int[2];

		for (int i=0; i < numbers.length; i++) {
			int[] number = numbers[i];
			for (int j=0; j < number.length; j++) {
				if (number[j] == left) lPoint = new int[] {i, j};
				if (number[j] == right) rPoint = new int[] {i, j};
				if (number[j] == target) tPoint = new int[] {i, j};
			}
		}

		int l = Math.abs(lPoint[0] - tPoint[0]) + Math.abs(lPoint[1] - tPoint[1]);
        int r = Math.abs(rPoint[0] - tPoint[0]) + Math.abs(rPoint[1] - tPoint[1]);

        if (l == r) return most;
		return l > r ? "R" : "L";
	}
}