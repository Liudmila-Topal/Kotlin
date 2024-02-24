package numbers_and_variable_types

/*
    Any variable can be converted into a String
 */
fun main(args: Array<String>){
    val cats = 3
    println(cats::class.java)
    val catsString = cats.toString()
    println(catsString::class.java)
}