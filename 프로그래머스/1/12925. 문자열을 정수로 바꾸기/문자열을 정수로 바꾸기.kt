class Solution {
    fun solution(s: String): Int {
        return change(s)
    }
    
    fun change(s: String) : Int {
        return if (s.contains("+")) {
            +(Integer.parseInt(s.split("+")[1]))
        } else if (s.contains("-")) {
            -(Integer.parseInt(s.split("-")[1]))
        } else Integer.parseInt(s)
    }
}