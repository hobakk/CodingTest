class Solution {
    fun solution(x: Int, n: Int): LongArray {
        return (1 .. n).map { it.toLong() * x }.toLongArray()
    }
}