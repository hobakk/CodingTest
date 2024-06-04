class Solution {
    fun solution(n: Int): Int {
        return (2..n).filter { n % it == 1 }
            .toList()
            .first()
    }
}