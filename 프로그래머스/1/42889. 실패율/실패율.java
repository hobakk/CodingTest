import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
		Arrays.sort(stages);
		int totalUsers = stages.length;
        int[] userInStage = new int[N + 2];
		double[] rates = new double[N];
        
        for (int stage : stages) {
            userInStage[stage]++;
        }

		for (int i=1; i <= N; i++) {
			if (totalUsers == 0) rates[i - 1] = 0;
			else {
                rates[i - 1] = (double) userInStage[i] / totalUsers;
                totalUsers -= userInStage[i];
            }
		}
        
        Integer[] result = new Integer[N];
        for (int i = 0; i < N; i++) {
            result[i] = i + 1;
        }
        Arrays.sort(result, (a, b) -> Double.compare(rates[b - 1], rates[a - 1]));

		return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
	}
}