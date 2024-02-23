package userInput

/*
    Input is read as a String
    Can be converted into numbers (integers)
    The readline command can return nothing (null)
    ?:"" - this is kind of a guard against empty returns, empty information
 */

fun main(args: Array<String>){
    println("Input a number:")

    val userInput = readLine()?:""
    println("You wrote: ${userInput.toInt() + 2}")
}