class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int combinedMap = arr1[i] | arr2[i]; 

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int bit = combinedMap & 1; 
                combinedMap >>= 1; 

                if (bit == 1) {
                    sb.insert(0, "#");
                } else {
                    sb.insert(0," ");
                }
            }

            answer[i] = sb.toString();
        }

        return answer;
    }
}
