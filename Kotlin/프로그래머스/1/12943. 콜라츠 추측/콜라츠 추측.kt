class Solution {
    private var count = 0
    
    fun solution(a: Int): Int {
        var num: Long = a.toLong()
        while (num != 1L) {
            if (count == 500) return -1
            
            num = getNum(num)
        }
        
        return count
    }
    
    fun getNum(num: Long): Long {
        count++
        return if (num % 2 == 0L) num / 2 else (num * 3) + 1
    }
}