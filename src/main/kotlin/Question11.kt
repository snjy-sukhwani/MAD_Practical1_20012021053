// Question :
// Write about Operator Overloading. Perform Matrix Addition, Subtraction & Multiplication using Class & operator overloading. Overload toString() function in Matrix class.

class Matrix(private val mat: Array<IntArray>, private val noOfRow: Int, private val noOfCol: Int) {

    // To display the Matrix :
    override fun toString(): String {
        var result = "($noOfRow x $noOfCol Matrix) : \n"
        for (i in mat) {
            for (j in i) {
                result += "$j\t"
            }
            result += "\n"
        }
        return result
    }

    // When we use the '+' operator :
    operator fun plus(obj: Matrix): Matrix {
        val sum = Array(this.noOfRow) { IntArray(this.noOfCol) }
        // Adding Two matrices
        for (i in 0 until this.noOfRow) {
            for (j in 0 until this.noOfCol) {
                sum[i][j] = this.mat[i][j] + obj.mat[i][j]
            }
        }
        return Matrix(sum, this.noOfRow, this.noOfCol)
    }

    // When we use the '-' operator :
    operator fun minus(obj: Matrix): Matrix {
        val sub = Array(this.noOfRow) { IntArray(this.noOfCol) }
        // Subtracting Two matrices
        for (i in 0 until this.noOfRow) {
            for (j in 0 until this.noOfCol) {
                sub[i][j] = this.mat[i][j] - obj.mat[i][j]
            }
        }
        return Matrix(sub, this.noOfRow, this.noOfCol)
    }

    // When we use the '*' operator :
    operator fun times(obj: Matrix): Matrix {
        val mul = Array(this.noOfRow) { IntArray(obj.noOfCol) }
        // Multiplying Two matrices
        for (i in 0 until this.noOfRow) {
            for (j in 0 until obj.noOfCol) {
                mul[i][j]=0
                for (k in 0 .. obj.noOfCol){
                    mul [i][j] += this.mat[i][k] * obj.mat[k][j]
                }
            }
        }
        return Matrix(mul, this.noOfRow, obj.noOfCol)
    }
}

fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2, 3)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)
    val secondMatrix2 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)


    println("*********************** Addition ***********************")
    println("Matrix 1 : ")
    println(secondMatrix2.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val addMatrix = secondMatrix2 + secondMatrix1   // plus operator overloading function invoked
    println("Addition : $addMatrix")

    println("*********************** Subtraction ***********************")
    println("Matrix 1 : ")
    println(secondMatrix2.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val subMatrix = secondMatrix2 - secondMatrix1   // minus operator overloading function invoked
    println("Subtraction : $subMatrix")

    println("*********************** Multiplication ***********************")
    println("Matrix 1 : ")
    println(firstMatrix.toString())
    println("Matrix 2 : ")
    println(secondMatrix1.toString())
    val mulMatrix = firstMatrix * secondMatrix1     // times operator overloading function invoked
    println("Multiplication : $mulMatrix")
}