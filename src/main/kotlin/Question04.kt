// Question 4 : Find the number is odd or even
fun main(){

    // Taking Number from User
    print("Enter the number you want to check : ")
    val n1 = readLine()!!.toInt()

    // We will check whether the number is divisible by 2 or not
    // If it is Divisible by 2, then it is EVEN
    // else it is ODD

    // "%" will give remainder
    if (n1%2==0){
        println("$n1 is EVEN !!")
    }
    else{
        println("$n1 is ODD !!")
    }
}