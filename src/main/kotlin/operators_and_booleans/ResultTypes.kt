package operators_and_booleans

/*
    The type of the result of an operation is the same as
    the type of the largest operand in terms of size in memory.

    Byte < Short < Int < Long < Float < Double
 */

fun main(args: Array<String>){
    val a: Short = 6
    val b: Int = 32
    val result = a * b
    println(result::class.java) // int

    val c: Long = 8374622
    val d: Float = 12.44F
    val result2 = c / d
    println(result2::class.java) // float

    val e: Float = 19F
    val f: Double = 54.345564
    val result3 = e * f
    println(result3::class.java) // double
}