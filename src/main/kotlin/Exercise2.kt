/*
Question :
Create two class named as Product and Laptop.
Inherit with this information: Product class should be parent and child class should be Laptop class.
Add Product Name, Quantity, Amount per Quantity in Product class.
In Laptop class add CPU name, RAM size, HDD Size, etc. of Laptop configuration.
Create primary and secondary Constructor of both class.
If Primary constructor is there then can we create secondary constructor in inheritance?
If we can create secondary and primary constructor both in child class then what is restriction
if parent have more than two different secondary constructor?
Create List of 5 laptops in ArrayList and display all objects information.
*/

open class Product(private var productName: String, private var productQty: Int, private var amountPerQty: Int) {

    // Secondary Constructor for class Product
//    constructor() : this("None", 0, 0) {
//        println("Secondary Constructor Invoked for Product !!")
//    }

    fun displayProductInfo() {
        println("Product Name : $productName")
        println("Product Quantity : $productQty")
        println("Product Amount (per Quantity) : $amountPerQty")
    }
}

class Laptop(
    private var cpuName: String, private var ramSize: Int, private var hddSize: Int, private var ssdSize: Int,
    productName: String, productQty: Int, amountPerQty: Int
) : Product(productName, productQty, amountPerQty) {

    // Secondary Constructor for class Laptop
    constructor() : this("None", 0, 0, 0, "None", 0, 0) {
        println("Secondary Constructor Invoked for Laptop !!")
    }

    fun displayLaptopInfo() {
        displayProductInfo()
        println("CPU Name : $cpuName")
        println("RAM Size : $ramSize GB")
        println("HDD Size : $hddSize GB")
        println("SSD Size : $ssdSize GB")
    }
}

fun main() {

    // Making 5 Laptops Objects :
    val lap0 = Laptop()
    val lap1 = Laptop("Core i5",8,1000,128,"Asus Laptop",1,60000)
    val lap2 = Laptop("Core i7",4,1000,256,"Hp Laptop",1,70000)
    val lap3 = Laptop("Core i9",16,4000,128,"Dell Laptop",1,90000)
    val lap4 = Laptop("Ryzen 7",4,2000,256,"Acer Laptop",1,55000)
    val lap5 = Laptop("Ryzen 9",18,10000,512,"Dell Laptop",1,150000)

    // Making an ArrayList for 5 Laptops :
    val myLaptops = ArrayList<Laptop> (6)

    myLaptops.add(lap0)
    myLaptops.add(lap1)
    myLaptops.add(lap2)
    myLaptops.add(lap3)
    myLaptops.add(lap4)
    myLaptops.add(lap5)

    // Using them to Display The Laptop Information :
    for (i in myLaptops){
        println("---------------")
        i.displayLaptopInfo()
        println("---------------\n")
    }

}