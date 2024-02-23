package numbers_and_variable_types

/*
    A variable of a certain type can be converted into a different type
    The variable itself does not get converted
    The result of the operation can be assigned to a new variable
 */

fun main(args: Array<String>) {
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)

    // If you convert to a smaller type, some information might be lost or corrupted
    val people = 7500000000
    val fewPeople = people.toInt() // -1089934592
    println(fewPeople)

    /*
      Functions: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble()

      It's not the variable type that is converted, it's the result of the operation that can be assigned
      to a new variable and that variable will have the desired type.
     */

    println("Please enter a number")
    val numberInput = readlnOrNull() ?: ""
    val myByte =  numberInput.toByte()
    println("$myByte variable has type \"${myByte::class.java}\"")

    println("Please enter a number")
    val firstNumber = readlnOrNull() ?: ""
    val secondNumber = 3.14159
    val result = firstNumber.toDouble() * secondNumber
    println("The result is $result and its type is ${result::class.java}")
}