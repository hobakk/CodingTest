class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for (int i=0; i < sizes.length; i++) {
            int firstNum = 0;
            for (int j=0; j < sizes[i].length; j++) {
                if (j == 0) {
                    firstNum = sizes[i][j];
                    continue;
                }

                if (firstNum > sizes[i][j]) {
                    sizes[i][0] = sizes[i][j];
                    sizes[i][j] = firstNum;
                }
            }

            if (width == 0 || width < sizes[i][0]) width = sizes[i][0];
            if (height == 0 || height < sizes[i][1]) height = sizes[i][1];
        }

        return width * height;
    }
}