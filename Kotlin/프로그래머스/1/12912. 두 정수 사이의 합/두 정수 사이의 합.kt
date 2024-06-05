class Solution {
    fun solution(a: Int, b: Int): Long {
        val range = if (a <= b) a..b else b..a
        return range.sumOf { it.toLong() }
    }
}