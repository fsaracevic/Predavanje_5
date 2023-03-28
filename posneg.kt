fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Provide 3 arguments, 2 integers and boolean true/false")
        return
    }

    val number1 = args[0].toIntOrNull()
    val number2 = args[1].toIntOrNull()
    val boolArg = args[2].toBooleanStrictOrNull()

    if (number1 == null || number2 == null || boolArg == null) {
        println("Invalid input. Please provide two integers and one boolean true/false")
        return
    }

    println(posNeg(number1, number2, boolArg))
}

fun posNeg(number1: Int, number2: Int, boolArg: Boolean): Boolean {
    return if (boolArg) {
        number1 < 0 && number2 < 0
    } else {
        (number1 < 0 && number2 > 0) || (number1 > 0 && number2 < 0)
    }
}