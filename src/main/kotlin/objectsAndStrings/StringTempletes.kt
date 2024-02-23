package objectsAndStrings/*
    Strings in Kotlin can contain expressions
    The expressions is evaluated and inserted (concatenated) into the string
    An expressions starts with a $ sign and can have braces {}
 */

fun main(args: Array<String>){
    val dogName = "T-Barney"
    println("My dog's name is $dogName")

    println("I have ${1 + 1} cats")

    var catName = "My cat's name is \"Fluffy\""
    println("The catName variable length is ${catName.length}")

    var myCar = "My car won't start"
    println("Extracted word: ${myCar.substring(3, 6)}")

    var clientName = "John"
    println("Hi $clientName. Welcome to the hell!")

    val apples = 3
    val oranges = 6
    println("The amount of fruits is: ${apples + oranges}.")

    val client = "Mary"
    val products = 3
    val price = 30
    println("$client needs to pay ${products * price} for $products products")
}