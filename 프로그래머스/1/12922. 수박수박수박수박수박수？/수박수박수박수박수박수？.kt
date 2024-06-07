class Solution {
    fun solution(n: Int): String {
        val sb: StringBuilder = StringBuilder()
        (0 until n).forEachIndexed { i, v -> if (i == 0 || i % 2 == 0) sb.append("수") else sb.append("박") }
        return sb.toString()
    }
}