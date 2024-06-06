class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        absolutes.forEachIndexed { i, v -> if (signs[i]) answer += v else answer -= v }
        return answer
    }
}