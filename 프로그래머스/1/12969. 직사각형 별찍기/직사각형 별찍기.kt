import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val sb = StringBuilder()
    val str = sc.nextLine()
    val list = str.split(" ")
    (0 until list[1].toInt()).forEach { 
        (0 until list[0].toInt()).forEach { i -> sb.append("*") }
        sb.append("\n")
    }
    
    println(sb.toString())
}

