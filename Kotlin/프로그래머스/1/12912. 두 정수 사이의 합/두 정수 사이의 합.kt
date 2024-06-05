class Solution {
    fun solution(a: Int, b: Int): Long {
        return (if (a > b) a..b else b..a).sum().toLong()
    }
}