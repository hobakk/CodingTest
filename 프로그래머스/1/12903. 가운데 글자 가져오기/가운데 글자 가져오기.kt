class Solution {
    fun solution(s: String): String {
        val ss = s.split("")
        val index = ss.size / 2
        return if (s.length % 2 == 0) ss[index -1] + ss[index] else ss[index]
    }
}