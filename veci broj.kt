fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Please enter two numbers as command-line arguments.")
        return
    }

    val number1 = args[0].toDoubleOrNull()
    val number2 = args[1].toDoubleOrNull()

    if (number1 == null || number2 == null) {
        println("Please enter valid numbers as command-line arguments.")
        return
    }

    val maxNumber = if (number1 > number2) number1 else number2
    println("The greater number is: $maxNumber")
}