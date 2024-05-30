class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val list: List<String> = n.toString().split("");
        for (numStr in list) {
            if (numStr.isEmpty()) continue
            else answer += Integer.parseInt(numStr)
        }
        
        return answer
    }
}