class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = getLeastCommonMultiple(answer, arr[i]);
        }

        return answer;
    }

    private int getGreatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }

    private int getLeastCommonMultiple(int a, int b) {
        return a * b / getGreatestCommonDivisor(a, b);
    }
}