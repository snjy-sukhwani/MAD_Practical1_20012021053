//Question : Display month name when user enter a month number using "when Expressions"
fun main(){
    // Taking Month Number from user
    print("Enter the Month : ")
    val mon = readLine()!!.toInt()

    // Checking for different values of month and print accordingly.
    when(mon){
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Please Enter proper Number")
    }
}