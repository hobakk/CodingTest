class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array(arr1.size) { 
            IntArray(arr1[it].size) { j -> arr1[it][j] + arr2[it][j] }
        }
    }
}