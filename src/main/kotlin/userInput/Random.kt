package userInput

import kotlin.random.Random

fun main(args: Array<String>){
    println(Random.nextInt())

    println(Random.nextInt(10)) // generates an integer from 0 until 9, 10 - limit is not included

    println(Random.nextInt(20, 30)) // generates an integer from 20 until 30, 20 is included, but 30 is not

    println(Random.nextDouble(300.0)) // generates a double
}