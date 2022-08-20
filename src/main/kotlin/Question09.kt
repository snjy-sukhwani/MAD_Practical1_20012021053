// Question : Find the max number from ArrayList.

fun main() {
    print("Enter Number of Elements : ")
    val size:Int = readLine()!!.toInt()
    val arr = ArrayList<Int>()
    var max = 0
    for (i:Int in 0 until size){
        print("arr[$i] = ")
        arr.add(i,readLine()!!.toInt())
        if (max<arr[i]){
            max = arr[i]
        }
    }

    println()
    println("Maximum Element from Array Without in-built Function : $max")
    println("Maximum Element from Array With in-built Function : ${arr.max()}")
}