import java.util.*;

class Solution {
    public int solution(int[][] boards, int[] moves) {
        int answer = 0;
        int totalLength = boards.length * boards.length;
        int index = 1;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=boards.length -1; i >= 0; i--) {
            int[] board = boards[i];
            for (int num : board) {
                map.put(index, num);
                index++;
            }
        }
        
        List<Integer> numbers = new ArrayList<>();
        for (int move : moves) {
            int select = 0;
            
            for (int i=totalLength - (boards.length - move); i > 0; i-=boards.length) {
                if (map.get(i) > 0) {
                    select = map.get(i);
                    map.put(i, 0); 
                    break; 
                }
            }
            
            if (select != 0) {
                if (!numbers.isEmpty() && numbers.get(numbers.size() -1) == select) {
                    numbers.remove(numbers.size() -1);
                    answer++;
                } else numbers.add(select);
            }
        }
        
        return answer * 2;
    }
}