class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        return (1 .. count).sumOf { price.toLong() * it }.let { if (money > it) 0 else it - money }
    }
}