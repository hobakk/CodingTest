class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 45
        numbers.forEach { answer -= it}
        return answer
    }
}