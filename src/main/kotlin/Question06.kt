// Question : By using a user defined function perform all arithmetic operations

// Function with Arguments :
fun allOperationsArgs(a:Int, b:Int,c:Int){
    println("Addition of $a, $b and $c : ${a+b+c}")
    println("Subtraction of $a, $b and $c : ${a-b-c}")
    println("Multiplication of $a, $b and $c : ${a*b*c}")
    println("Division of $b and $a : ${b/a}")
}

fun main(){
    allOperationsArgs(111,2222,-222)
}