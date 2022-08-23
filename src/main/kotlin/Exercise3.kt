/*
Question :
Create two class named as Person and Student.
Inherit with this information: Person class should be parent and child class should be Student class.
Add first name, last name, age in Person class.
In Laptop class add enrollment no, branch, class, lab batch, etc.
Create primary and secondary Constructor of both class.
Create List of 5 students in ArrayList and display all objects information.
*/

open class Person(private val firstName: String, private val lastName: String, private val age: Int) {

    // Secondary Constructor for Class Person :
    // constructor() : this("Unknown", "Unknown", 0) {
    //     println("Secondary Constructor Called for Person !!")
    // }

    init {
        println("Person is Created . . . ")
    }

    fun displayStudentPersonalDetails() {
        println("Student First Name : $firstName")
        println("Student Last Name : $lastName")
        println("Student Age : $age")
    }
}

class Student(
    private val studEnrollNo: String,
    private val studBranch: String,
    private val studClass: String,
    private val studBatch: String,
    firstName: String,
    lastName: String,
    age: Int
) : Person(firstName, lastName, age) {

    init {
        println("Student is Created . . . ")
    }

    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN", "NaN", 0) {
        println("Secondary Constructor Called for Student !!")
    }

    private fun displayStudentAcademicInfo() {
        println("Student Enrollment Number : $studEnrollNo")
        println("Student Branch : $studBranch")
        println("Student Class : $studClass")
        println("Student Batch : $studBatch")
    }

    fun displayStudentFullInfo(){
        displayStudentPersonalDetails()
        displayStudentAcademicInfo()
    }
}

fun main() {

    // Making Objects for Student :
    val stud0 = Student()
    val stud1 = Student(studEnrollNo = "20012021053", studBranch = "IT", studClass = "CEIT-D", studBatch = "AB15", firstName = "Sanjay", lastName = "Sukhwani", age = 20)
    val stud2 = Student(studEnrollNo = "T20012021050", studBranch = "IT", studClass = "CEIT-D", studBatch = "AB15", firstName = "Sanjay", lastName = "Sukhwani", age = 20)
    val stud3 = Student(studEnrollNo = "20012022012", studBranch = "CE", studClass = "CEIT-A", studBatch = "AB1", firstName = "Mohan", lastName = "Sharma",age = 19)
    val stud4 = Student(studEnrollNo = "20002020050", studBranch = "CE-AI", studClass = "CEIT-B", studBatch = "AB4", firstName = "Rohan", lastName = "Patel",age = 21)
    val stud5 = Student(studEnrollNo = "20012022053", studBranch = "CE", studClass = "CEIT-C", studBatch = "AB6", firstName = "Rahul", lastName = "Agarwal",age = 21)

    // Making an ArrayList for 5 Laptops :
    val myStudents = ArrayList<Student> (6)

    myStudents.add(stud0)
    myStudents.add(stud1)
    myStudents.add(stud2)
    myStudents.add(stud3)
    myStudents.add(stud4)
    myStudents.add(stud5)

    // Using them to Display The Student Information :
    for (i in myStudents){
        println("---------------")
        i.displayStudentFullInfo()
        println("---------------\n")
    }

}