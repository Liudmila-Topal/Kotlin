package nullability
/*
    ?: the 'Elvis' operator basically guarantees that a result is returned
       Either the actual result for a non-null variable, or a default value
 */

fun main(args: Array<String>){
    var catName: String? = null
    println(catName?:"The cat has no name")

    // After an elvis operator, there's no need for null safety because the elvis operator guarantees a value
    println(catName?:"Fluffy".length)
}