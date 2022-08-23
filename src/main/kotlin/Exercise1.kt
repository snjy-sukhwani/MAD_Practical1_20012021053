// Question : Swap Value of two variables without using third variable and with using third variable.

fun main() {
    // Swapping Values of 2 variables with third Variables :
    var a=20
    var b=40
    println("# Using Third Variable")
    println("\n\t---------- Before Swapping ----------")
    println("\ta = $a\n\tb = $b")
    // Swapping
    val temp = a
    a=b
    b=temp

    println("\t---------- After Swapping ----------")
    println("\ta = $a\n\tb = $b")

    // Swapping Values of 2 variables without third Variables :
    var x = 16
    var y = 10
    println("\n# Without Using Third Variable\n")
    println("\t---------- Before Swapping ----------")
    println("\tx = $x\n\ty = $y")
    // Swapping :
    x = (x + y)
    y = (x - y)
    x = (x - y)

    println("\t---------- After Swapping ----------")
    println("\tx = $x\n\ty = $y")
}