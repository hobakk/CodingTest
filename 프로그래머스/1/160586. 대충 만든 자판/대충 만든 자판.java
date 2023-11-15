class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i=0; i < targets.length; i++) {
            String target = targets[i];
            int sum = 0;
            
            for (int j=0; j < target.length(); j++) {
                char c = target.charAt(j);
                int count = 101;
                
                for (String key : keymap) {
                    for (int x=0; x < key.length(); x++) {
                        if (c == key.charAt(x)) {
                            count = Math.min(count, x + 1);
                            break;
                        }
                    }
                }
                           
                if (count == 101) {
                    sum = -1;
                    break;
                }
                
                sum += count;
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}