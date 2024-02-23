package userInput

/*
    User input can come from many sources
    One way is from the command line
 */

fun main(args: Array<String>) {
    println("Input something")

    val userInput = readlnOrNull() // you can type only one line because this will read only one line
    println("You wrote: $userInput")

    println("What is your name:")
    val userName = readlnOrNull() ?: ""
    println("Hi $userName")

    println("Please enter a number")
    val number = readlnOrNull() ?: ""
    val result = number.toInt() * 5
    println("$number * 5 = $result")

    println("Please enter your birth year")
    val birthDay = readlnOrNull() ?: ""
    println("Enter current year")
    val currentYear = readlnOrNull() ?: ""
    val result2 = currentYear.toInt() - birthDay.toInt()
    println("You are $result2 or ${result2 - 1} years")
}