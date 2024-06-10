class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var sum = (1 .. count).sumOf { price.toLong() * it }
        return if (money > sum) 0 else sum - money
    }
}