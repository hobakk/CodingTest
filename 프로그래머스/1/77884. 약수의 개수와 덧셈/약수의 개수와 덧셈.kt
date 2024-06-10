class Solution {
    fun solution(left: Int, right: Int): Int {
        return (left .. right).sumOf {
            var count = 0
            (1..it).forEach { num -> if (it % num == 0) count++ }
            if (count % 2 == 0) +it else -it
        }
    }
}