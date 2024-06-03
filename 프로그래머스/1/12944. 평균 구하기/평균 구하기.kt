class Solution {
    fun solution(arr: IntArray): Double {
        return arr.map { it.toDouble() }.average()
    }
}