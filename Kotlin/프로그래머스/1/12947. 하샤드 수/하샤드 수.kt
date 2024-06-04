class Solution {
    fun solution(x: Int): Boolean {
        val result = x.toString().split("")
            .filter { it.isNotEmpty() }
            .sumOf { it.toInt() }
            
        return x % result <= 0
    }
}