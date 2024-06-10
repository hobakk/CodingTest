class Solution {
    fun solution(s: String): String {
        return s.split("").sortedDescending().joinToString("")
    }
}