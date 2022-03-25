class ArrayFunctions(arr: Array<Int>) {
    var arrayOfNumbers = arr

    init {
        require(arr.size != null || arr.size != 0) { "El array no debe estar vacío" }
    }

    fun maxNumber(): Int {
        var maxnumber: Int = 0

        arrayOfNumbers.forEach {
            if (it > maxnumber) maxnumber = it
        }
        return maxnumber
    }

    fun minNumber(): Int {
        var minnumber: Int = 99999

        arrayOfNumbers.forEach {
            if (it < minnumber) minnumber = it
        }
        return minnumber
    }

    fun orderArray(): Array<Int> {
        arrayOfNumbers.sort()
        return arrayOfNumbers
    }

    fun sumArray(): Int {
        var suma: Int = 0

        arrayOfNumbers.forEach {
            suma += it
        }
        return suma
    }
}

fun main() {
    val arr1 = arrayOf(3,7,1,9,2)
    val arrFunc = ArrayFunctions(arr1)
    var sortedArray = arrFunc.orderArray()

    println(arrFunc.maxNumber())
    println(arrFunc.minNumber())
    sortedArray.forEach { print("$it ") }
}