class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int fLength = food.length;
        
        for (int i=fLength; i > 0; i--) {
            if (i == fLength) {
                sb.append("0");
                continue;
            }
            
            for (int j=0; j < food[i] / 2; j++) {
                sb.append(i);
                sb.insert(0, i);
            }
        }
        
        return sb.toString();
    }
}