// Question : Type conversion - Integer to Double, String to Integer, String to Double

fun main(){

    val num1InInt:Int = 34      // Making an Integer Variable
    val num2InString:String = "12345"     // Making an String Variable
    val num3InString:String = "12345.456"     // Making an String Variable

    // Converting Int to Double
    val num1ToDouble = num1InInt.toDouble()

    // Converting String to Integer
    val num2ToInt = num2InString.toInt()

    // Converting String to Double
    val num3ToDouble = num3InString.toDouble()

    // Printing All Values :
    // Adding 10 to all the variables
    // If it is numeric(int,double) then it will be added
    // else, it will append in case of Strings

    println("Value of num1InInt : ${num1InInt + 10}")
    println("Value of num1ToDouble : ${num1ToDouble + 10}")
    println("Value of num2InString : ${num2InString + 10}")
    println("Value of num2ToInt : ${num2ToInt + 10}")
    println("Value of num3InString : ${num3InString + 10}")
    println("Value of num3ToDouble : ${num3ToDouble + 10}")

}