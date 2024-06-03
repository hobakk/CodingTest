import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        val sqrtValue = sqrt(n.toDouble())
        return if (sqrtValue == floor(sqrtValue)) {
            val newNum = sqrtValue.toLong().plus(1)
            newNum * newNum
        } else -1L
    }
}