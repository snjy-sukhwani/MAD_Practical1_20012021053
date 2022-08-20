// Question : Write Different types of Class & Constructor. Create a class Car and set various members like type, model, price, owner. add the function getCarPrice in it. Create an object of Car class and access property of it. (getCarInformation(), getOriginalCarPrice(), getCurrentCarPrice(), displayCarInfo() etc.)

fun main() {

    // Making an Object of Class Car
    val c1 = Car("BMW, 2018", "Aman", 105, 100000.0, 98950.0)
    c1.getCarFullDetails()

    // Making an Object of Class Car
    val c2 = Car("BMW, 2019", "Karan", 20, 400000.0, 399800.0)
    c2.getCarFullDetails()

    // Creating ArrayList of Car Objects with initialCapacity of 2:
    val myCars = ArrayList<Car> (2)

    // Making an Object of Class Car
    val car1 = Car("Toyota, 2017","KJS",100,1080000.0,1079000.0)

    // Making an Object of Class Car
    val car2 = Car("Maruti, 2020","NPP",200,4000000.0,3998000.0)

    // Adding Objects to the ArrayList
    myCars.add(car1)
    myCars.add(car2)

    for (i in myCars){
        println("-------------------")
        i.getCarFullDetails()
    }
}

class Car(private val model: String, private val owner: String, private val milesDrive: Int, private val orgPrice: Double, private val currPrice: Double) {
    init {
        println("Object of class is Created and Init is Called.")
    }

    private fun getCarInfo(): String {
        return model
    }

    private fun getCarOwner(): String {
        return owner
    }

    private fun getMilesDriven(): Int {
        return milesDrive
    }

    private fun getOriginalPrice(): Double {
        return orgPrice
    }

    private fun getCurrentPrice(): Double {
        return currPrice
    }

    fun getCarFullDetails() {
        println("-------------------")
        println("Car Information : ${this.getCarInfo()}")
        println("Car owner : ${this.getCarOwner()}")
        println("Miles Drive : ${this.getMilesDriven()}")
        println("Original Car Price : ${this.getOriginalPrice()}")
        println("Current Car Price : ${this.getCurrentPrice()}")
        println("-------------------\n")
    }
}