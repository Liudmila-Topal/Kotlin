package operators_and_booleans

/*
    = the equals or the assignment operator (simply says, take this value and give it to this variable)
    $ reference to a variable inside a string
    ${} reference expression (it simply the same kind of meaning as the reference operator in a string,
        but it allows us to put a expression inside that string)
 */

fun main(args: Array<String>){
    val dozen = 12
    val months = dozen
    println(months)

    val userName = "Lucy"
    val greeting = "Hi, $userName"
    println(greeting)

    val products = 3
    val price = 9.99
    val total = "Total is ${price * products}"
    println(total)
}