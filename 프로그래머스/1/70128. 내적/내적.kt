class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0
        (0 until a.size).forEachIndexed { i, v -> answer += a[i] * b[i] }
        return answer
    }
}