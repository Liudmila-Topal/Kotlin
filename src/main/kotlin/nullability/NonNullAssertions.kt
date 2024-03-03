package nullability
/*
    !!. - a developer guarantee that the variable is not null.
        This bypasses all the language checks for null safety
        Can trigger a program crash
 */
fun main(args: Array<String>){
    val catName: String? = null
    println(catName?:"Lyly"!!.length)
    println(catName!!.length)
}