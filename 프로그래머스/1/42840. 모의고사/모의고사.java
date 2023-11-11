import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int aSum = 0;
        int bSum = 0;
        int cSum = 0;
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;
        
        for (int i=0; i < answers.length; i++) {
            if (answers[i] == a[aIndex]) aSum++;
            if (answers[i] == b[bIndex]) bSum++;
            if (answers[i] == c[cIndex]) cSum++;
            
            aIndex++;
            bIndex++;
            cIndex++;
            
            if (aIndex == 5) aIndex = 0;
            if (bIndex == 8) bIndex = 0;
            if (cIndex == 10) cIndex = 0;
        }
        
        int max = Math.max(aSum, Math.max(bSum, cSum));
            
        int[] arr = {aSum, bSum, cSum};
        List<Integer> result = new ArrayList<>();
        for (int j=0; j < 3; j++) {
            if (max == arr[j]) result.add(j + 1);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}