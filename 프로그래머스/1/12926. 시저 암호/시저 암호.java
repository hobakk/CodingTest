class Solution {
    public String solution(String s, int n) {
        int sLength = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < sLength; i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                sb.append(" ");
                continue;
            }
            
            sb.append(getChar(c, n));
        }

        return sb.toString();
    }
    
    private char getChar(char c, int n) {
        if (Character.isLowerCase(c)) {
            return (char) ('a' + (c - 'a' + n) % 26);
        } else {
            return (char) ('A' + (c - 'A' + n) % 26);
        }
    }
}