// Question : Find the factorial of number by recursion. Explain "tailrec" keyword.

// Tail Recursion :
// In tail recursion, calculations are performed first, then recursive calls are executed
// To tell compiler to perform tail recursion in Kotlin, we need to mark the function with tailrec modifier.

fun factLoop(num:Int):Int{
    var fact=1
    for (i in 1..num) {
        fact *= i
    }
    return fact
}

tailrec fun factTailrec(n:Int):Int {
    return if (n==1) 1 else n * factTailrec(n-1)
}

fun main() {
    print("Enter Number : ")
    val num : Int = readLine()!!.toInt()
    println("Factorial of $num : ${factLoop(num)}")
    println("By Tailrec Keyword, Factorial of $num : ${factTailrec(num)}")
}