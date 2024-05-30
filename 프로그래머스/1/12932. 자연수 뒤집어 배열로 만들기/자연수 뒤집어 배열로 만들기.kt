import java.util.Stack

class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        val numList = n.toString().split("")
        val stack = Stack<Int>()
        
        for (i in 0 until numList.size) {
            val numStr = numList[i]
            if (numStr.isNotEmpty()) {
                stack.push(Integer.parseInt(numStr))
            }
        }

        val list = IntArray(stack.size)
        for (i in 0 until stack.size) {
            list.set(i, stack.pop())
        }
        
        return list
    }
}