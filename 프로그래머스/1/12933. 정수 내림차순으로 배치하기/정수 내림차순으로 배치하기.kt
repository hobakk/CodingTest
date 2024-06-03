class Solution {
    fun solution(n: Long): Long {
        var answer = n.toString().split("")
            .filter { it.isNotEmpty() }
            .sortedDescending()
            .joinToString("")
            .toLong();
        return answer
    }
}