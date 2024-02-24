package operators_and_booleans
/*
    They represent basically one aor two values.
    They either represent 'true' or 'false'.

    Logical operators, are operators that will give us a true or a false result:
    - && 'and'
    - || 'or'
    - ! 'not'

    Comparison operators:
    - > 'greater than'
    - < 'smaller than'
    - >= 'greater than or equal to'
    - <= 'smaller than or equal to'
    - == 'equals'
    - != 'not equals'
 */

fun main(args: Array<String>){
    val isDay = true
    val isEvening = true
    println(isDay && isEvening)

    val isNight = !isDay
    println(isNight)

    val a = 5
    val b = 1
    println("$a > $b will return ${a > b}")
    println("$a < $b will return ${a < b}")
    println("$a >= $b will return ${a >= b}")
    println("$a <= $b will return ${a <= b}")
    println("$a == $b will return ${a == b}")
    println("$a != $b will return ${a != b}")

    val exp1 = 5.374 * 9.5847
    val exp2 = 3.237 * 15.3726
    println("Is $exp1 > $exp2: ${exp1 > exp2}")

    val exp3 = ((true && false) || (true || false))
    println(exp3)

    val exp4 = !((3 >= 3) && (false || (2 < 5)))
    println(exp4)

    val toys = 2
    val brokenToys = 1
    val notBrokenToys = toys - brokenToys
    val canGetNewToys = ((toys < 5) && (notBrokenToys >= 1))
    println("Will the child get a new toy? $canGetNewToys")

    val cows = 3
    val milkCows = 1
    val children = 2
    val result = ((cows <= 5) && (milkCows >= 0) || (children +1 >= 3))
    println("Does the farmer receive the funding? $result")
}