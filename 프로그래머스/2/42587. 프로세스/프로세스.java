import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;

        for (int priority : priorities) {
            queue.add(priority);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (hasHigherPriority(queue, current)) queue.add(current);
            else {
                answer++; 
                if (location == 0) break;
            }

            location = (location - 1 + queue.size()) % queue.size();
        }

        return answer;
    }

    private boolean hasHigherPriority(Queue<Integer> queue, int current) {
        for (int priority : queue) {
            if (priority > current) {
                return true;
            }
        }
        
        return false;
    }
}