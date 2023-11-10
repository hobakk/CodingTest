import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxMon = nums.length / 2;
        return Math.min(maxMon, set.size());
    }
}