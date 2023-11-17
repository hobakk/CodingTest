class Solution {
    public int[] solution(String[] wallpaper) {
        int max = 0;
        int min = 51;
        int first = 0;
        int last = wallpaper.length;
        
        for (int i=0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                first = i;
                break;
            }
        }
        
        for (int i=wallpaper.length -1; i >= 0; i--) {
            if (wallpaper[i].contains("#")) {
                last = i;
                break;
            }
        }
        
        for (String word : wallpaper) {
            if (!word.contains("#")) continue;
            
            for (int i=0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == '#') {
                    max = max > i ? max : i;
                    min = min < i ? min : i;
                }
            }
        }
        
        int[] answer = {first, min, last + 1, max + 1};
        return answer;
    }
}