class Solution {
    fun solution(s: String): Boolean {
        return if ((s.length == 4 || s.length == 6) && s.matches("[0-9]+".toRegex())) true else false
    }
}