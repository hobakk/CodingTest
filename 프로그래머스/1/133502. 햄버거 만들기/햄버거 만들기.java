class Solution {
    public int solution(int[] ingredient) {
        int[] arr = new int[ingredient.length];
        int index = 0, answer = 0;
        for(int num : ingredient) {
            arr[index] = num;
            index++;

            if(index >= 4) {
                if(arr[index - 4] == 1 && arr[index - 3] == 2 && arr[index - 2] == 3 && arr[index - 1] == 1) {
                    index -= 4;
                    answer++;
                }
            }
        }

        return answer;
    }
}