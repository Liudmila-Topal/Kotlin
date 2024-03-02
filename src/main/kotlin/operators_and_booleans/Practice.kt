package operators_and_booleans

fun main(args: Array<String>) {
    // 1
    var a = 76.254
    var b = 3.867

    println("Addition: ${a + b}")
    println("Subtraction: ${a - b}")
    println("Multiplication: ${a * b}")
    println("Division: ${a / b}")
    println("Remainder: ${a % b}")

    // 2
    val kil = 29.99
    val amount = 1F / 3
    println("Total  is ${kil * amount}")

    // 3
    println("Please enter tha amount of your bank account:")
    val amountInput = readlnOrNull() ?: ""
    val bankAmount = amountInput.toDouble()
    println("Congratulations, you now have ${bankAmount * 3}")

    //
    println("Please enter tha amount of your bank account:")
    val inputAmount = readlnOrNull() ?: ""
    val am = inputAmount.toDouble()
    val percentAfter5Years = am * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
    println("Congratulations, you now have ${percentAfter5Years}")
}