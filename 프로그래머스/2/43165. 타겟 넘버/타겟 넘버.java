class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int index, int currentSum) {
        if (index == numbers.length) {
            return (currentSum == target) ? 1 : 0;
        }

        int result = 0;
        result += dfs(numbers, target, index + 1, currentSum + numbers[index]);
        result += dfs(numbers, target, index + 1, currentSum - numbers[index]);

        return result;
    }
}