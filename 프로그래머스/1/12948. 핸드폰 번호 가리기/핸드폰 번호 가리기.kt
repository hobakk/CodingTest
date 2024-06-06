class Solution {
    fun solution(phone_number: String): String {
        val nLength = phone_number.length
        val sb : StringBuilder = StringBuilder()
        (0 until nLength.minus(4)).forEach { sb.append("*") }
        return sb.append(phone_number.substring(nLength.minus(4), nLength)).toString()
    }
}