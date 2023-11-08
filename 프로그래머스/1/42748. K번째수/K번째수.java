import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i < commands.length; i++) {
            int[] cm = commands[i];
            if (cm[0] == cm[1]) {
                answer[i] = array[cm[0] -1];
                continue;
            }
            
            List<Integer> numList = new ArrayList<>();
            for (int j=cm[0]; j <= cm[1]; j++) {
                numList.add(array[j -1]);
            }

            Collections.sort(numList);
            answer[i] = numList.get(cm[2] -1);
        }
        
        return answer;
    }
}