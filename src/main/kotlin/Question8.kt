// Question : Create different types of Array as shown in image. Explore Arrays.deepToString(), contentDeepToString() methods, IntArray variable .joinToString()  and use in program to print Array. Explore range, downTo, until etc. for loop and use in this program. Sort Array of Integer data type without using inbuilt function & with using inbuilt function

fun main() {

    // Creating Array by using arrayOf() method
    println("Creating Array-1 by using arrayOf() Method : ")
    val arr1 = arrayOf(10,90,60,80,100)
    println(arr1.contentToString())

    // Creating Array by using Array<>()
    println("Creating Array-2 by using Array<>() : ")
    val arr2 = Array(5) { 0 }
    println(arr2.contentToString())

    // Creating Array by using Array<>() and lambda function
    println("Creating Array-3 by using Array<>() and lambda function : ")
    val arr3 = Array(8) { i -> i }
    println(arr3.contentToString())

    // Creating Array by using IntArray()
    println("Creating Array-4 by using IntArray() : ")
    val arr4 = IntArray(5)
    println(arr4.joinToString(", "))

    // Creating Array by using intArrayOf() :
    println("Creating Array-5 by using intArrayOf() : ")
    val arr5 = intArrayOf(12,10,1,5,18,19)
    println(arr5.joinToString(", "))

    // Creating 2-D Array using arrayOf() and intArrayOf() :
    println("Creating 2-D Array using arrayOf() & intArrayOf() : ")
    val arr6 = arrayOf(
        intArrayOf(1,3),
        intArrayOf(4,5),
        intArrayOf(6,7)
    )
    println(arr6.contentDeepToString())

    // Creating Array by Taking Elements from User:
    print("Enter number of Elements : ")
    val size:Int = readLine()!!.toInt()
    val arr7 = IntArray(size) { 0 }

    // until used to iterate over range from 0 to n [not including n]
    for (i in 0 until size){
        print("Enter the Element : ")
        arr7[i] = readLine()!!.toInt()
    }

    println("\nEntered Array : ")
    println(arr7.contentToString())

    // Sorting with in-built function :
    println("------------------------>> With In-Built Function <<------------------------")
    println("Array After Sorting by in-built Function : ")
    arr7.sort()
    println(arr7.contentToString())

    // Sorting without in-built function :
    val arr8 = intArrayOf(34,78,12,0,89,45,-23,-67,-999,980)
    println("------------------------>> Without In-Built Function <<------------------------")
    println("Array Before Sorting without in-built Function : ")
    println(arr8.contentToString())

    // Sorting Array
    var temp:Int
    for (i in arr8.indices){
        for (j in arr8.indices){
            if(arr8[j]>arr8[i]){
                temp = arr8[j]
                arr8[j] = arr8[i]
                arr8[i] = temp
            }
        }
    }
    println("Array After Sorting without in-built Function : ")
    println(arr8.contentToString())
}