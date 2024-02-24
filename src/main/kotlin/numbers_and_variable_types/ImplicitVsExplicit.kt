package numbers_and_variable_types

/*
    Numbers implicit are decided by Kotlin.
    When we create a variable without specifying what kind of variable we want, the system Kotlin just
    decides which is the most appropriate number type and just assigns that to our variable.

    Kotlin decides the most appropriate variable type based on the value provided
 */

fun main (args: Array<String>){
    val cats = 3
    println(cats::class.java)
    // explicit
    val price = 14.99
    println(price::class.java)

    /*
    We can instruct Kotlin to assign a different type to our variables
     */
    val dogs: Byte = 7
    println(dogs::class.java)

    // implicit
    val days: Short = 2000
    println(days::class.java)

    val life = 42L
    println(life::class.java)
}