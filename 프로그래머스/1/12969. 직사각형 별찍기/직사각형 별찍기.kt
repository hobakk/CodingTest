fun main(args: Array<String>) {
    val sb = StringBuilder()
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    (0 until b).forEach { 
        (0 until a).forEach { i -> sb.append("*") }
        sb.append("\n")
    }
    
    println(sb.toString())
}

