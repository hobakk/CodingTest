class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1Index = 0;
        int c2Index = 0;
        
        for (int i=0; i < goal.length; i++) {
            String target = goal[i];
            if (c1Index < cards1.length && target.equals(cards1[c1Index])) {
                c1Index++;
            } else if (c2Index < cards2.length && target.equals(cards2[c2Index])) {
                c2Index++;
            } else return "No";
        }
        
        return "Yes";
    }
}