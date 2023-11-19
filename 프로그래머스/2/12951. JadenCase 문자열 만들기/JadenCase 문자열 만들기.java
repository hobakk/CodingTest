class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean startOfWord = true;

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                startOfWord = true;
                answer.append(c);
            } else {
                if (startOfWord) {
                    answer.append(Character.toUpperCase(c));
                    startOfWord = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }

        return answer.toString();
    }
}