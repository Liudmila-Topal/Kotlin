/*
    Variables:
    Changeable (mutable) - changeable - var
    Read only (immutable) - unchangeable - val

    Name can contain letters, numbers and underscore _
    Name must start with a letter or underscore
    Name can be anything except Kotlin keywords: var, val, println...etc
    camelCase
 */
fun main (args: Array<String>){
   var tvShows = "many"
    println(tvShows)
    
    tvShows = "too many"
    println(tvShows)

    val catName = "My cat's name is \"Fluffy\""
    println(catName)

    var slashes = "Two types of slashes: \\ and /"
    println(slashes)

    val url = "https://google.com"
    println(url)

    var rabbit1 = "(\\(\\"
    var rabbit2 = "(-.-)"
    var rabbit3 = "o_(\")(\")"
    println(rabbit1)
    println(rabbit2)
    println(rabbit3)
}