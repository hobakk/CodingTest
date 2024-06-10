class Solution {
    fun solution(s: String): String {
        return s.split("").filter { it.isNotEmpty() }.sortedDescending().joinToString("")
    }
}