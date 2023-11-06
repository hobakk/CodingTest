import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = Integer.toString(n).length();
        for (int i = 0; i < length; i++) {
            answer = answer + (n % 10);
            n /= 10;
        }

        return answer;
    }
}