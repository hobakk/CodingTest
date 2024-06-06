class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val resultList = arr.filter { it % divisor == 0 }.sorted().toIntArray()
        return if (resultList.size > 0) resultList else intArrayOf(-1)
    } 
}