package nullability
/*
    No value present - it doesn't mean that it's empty because you can have like, for instance,
    an empty string that's still a value for that string. The variable doesn't have a place, doesn't really exist.
    You can't perform any kind of operation on it.

    if you use a variable with a null value, your program will crash with a NullPointerException (NPE)

    Kotlin guards against null values

    Kotlin differentiates between variables that can be null and those that cannot
    Use the ? operator.
    - If the value cannot be null, it must be given a value
    - If the value can be null, giving it a value is optional in this case you must provide the value 'null'
 */

fun main(args: Array<String>){
    val herName: String = "Lily"
    val hisName: String? = null // The 'null' keyword is used to assign the value null to a nullable value
    println(hisName)

    var catName: String? = "Fluffy"
    println(catName?.length) // ?. nullable operator(save call)
    catName = null
    println(catName?.length)

    // Safe calls can be changed for multiple operations
    catName?.length?.toString()

    /*
    Arithmetic operators can only work if your variables are not null.

    We cannot use the classic operators for null variables
    We have replacement methods:
    + -> ?.plus()
    - -> ?.minus()
    * -> ?.times()
    / -> ?.div()
    % -> ?.rem()
    */

    val a: Int? = 10
    println(a?.plus(5)) // 15
    println(a?.minus(8)) // 2
    println(a?.times(50)) //500
    println(a?.div(2)) // 5
    println(a?.rem(3)) // 1
}