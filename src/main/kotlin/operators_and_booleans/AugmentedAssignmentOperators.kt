package operators_and_booleans

/*
    They are basically a simple concept where we take the assignment operators.
    Combine that operator with the arithmetic operators to kind of have a shorthand way of writing our code.

    +=
    -=
    *=
    /=
    %=
 */

fun main(args: Array<String>){
    var bikes = 5
    println(bikes)
    bikes += 3
    println(bikes)

    var oranges = 10
    println(oranges)
    oranges -=5
    println(oranges)

    oranges *=2
    println(oranges)

    oranges /=2
    println(oranges)

    oranges %=2
    println(oranges)
}