// Question : Scan student’s information and display all the data.
fun main(){
    // Taking Data From user :
    print("Student Enrollnment Number : ")
    val studEnrollNo:String = readLine()!!.toString()
    print("Student Name : ")
    val studName:String = readLine()!!.toString()
    print("Student Age : ")
    val studAge:Int = readLine()!!.toInt()
    print("Student Branch : ")
    val studBranch:String = readLine()!!.toString()
    print("Student Class : ")
    val studClass:String = readLine()!!.toString()
    print("Student Batch : ")
    val studBatch:String = readLine()!!.toString()
    print("Student College Name : ")
    val studColName:String = readLine()!!.toString()
    print("Student University Name : ")
    val studUniName:String = readLine()!!.toString()

    // Printing all the Data :
    println("\n\n---------->> Student Data <<----------")
    println("Enrollnment Name : $studEnrollNo")
    println("Name : $studName")
    println("Age  : $studAge")
    println("Branch : $studBranch")
    println("Class : $studClass")
    println("Batch : $studBatch")
    println("College Name : $studColName")
    println("University Name : $studUniName")
}