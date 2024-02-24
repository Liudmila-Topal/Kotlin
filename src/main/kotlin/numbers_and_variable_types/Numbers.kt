package numbers_and_variable_types

/*
    Numbers in Kotlin are the same as numbers im math: 3, 6, -47...etc
    Numbers can be assigned to variables: var price = 334
    We can perform operations on numbers and variables
 */

fun main(args: Array<String>) {
    var price = 44
    var items = 3
    var totalPrice = price * items
    println("Total price is $totalPrice")

    /*
    Numbers types: Byte, Short, Int, Long, Float, Double

    Different types that are stored in memory in different ways
    Number types have limits: There is a biggest and smallest number of a certain type
     */
    var items2 = 5
    println("Items are: $items2 and it's type \"${items2::class.java}\"")
    var nbOfPeople = 750000
    println("Number of people are: $nbOfPeople and it's type \"${nbOfPeople::class.java}\"")
    var price2 = 29.99
    println("Price is: $price2 and it's type \"${price2::class.java}\"")
    var pi = 3.1415926535
    println("Pi is: $pi and it's type \"${pi::class.java}\"")

    println("Please enter the number:")
    var firstNumber = readlnOrNull() ?: ""
    var secondNumber = 10.05
    var result = firstNumber.toInt() * secondNumber
    println("The type of result: $result is \"${result::class.java}\"")
}