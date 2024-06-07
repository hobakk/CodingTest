class Solution {
    fun solution(arr: IntArray): IntArray {
        val min = arr.sorted().first()
        return arr.filter { it > min }.toIntArray()
    }
}