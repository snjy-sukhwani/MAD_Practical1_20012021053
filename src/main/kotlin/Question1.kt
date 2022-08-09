// Question 1 : Store & Display values in different variable of different type (Integer, Double, Float, Long, Short, Byte, Char, Boolean, String)
fun main(){
    // To Print Text on Screen
    // println("Hello World !!")

    // Defining Variables :
    val n1: Int = 120
    val n2: Double = 34.546
    val n3: Float = 12.34f   // By default, the value is Double so to make it float we use 'f' or 'F' after the value
    val n4: Long = 1233443556
    val n5: Short = 34
    val n6: Byte = 89
    val ch: Char = 'a'
    val done: Boolean = false
    val name: String = "Sanjay"

    // Printing all the Variables :
    println("Integer Value : $n1")
    println("Double Value : $n2")
    println("Float Value : $n3")
    println("Long Value : $n4")
    println("Short Value : $n5")
    println("Byte Value : $n6")
    println("Char Value : $ch")
    println("Boolean Value : $done")
    println("String Value : $name")
}