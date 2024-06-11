class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)
        val lcm = (n * m) / gcd
        return intArrayOf(gcd, lcm)
    }

    fun gcd(n: Int, m: Int): Int {
        return if (m == 0) n else gcd(m, n % m)
    }
}
