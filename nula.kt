fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide a number")
        return
    }

    val number = args[0].toDoubleOrNull()

    if (number == null) {
        println("Invalid input. Please provide a number")
        return
    }

    val comparison = when {
        number > 0 -> "greater than"
        number < 0 -> "less than"
        else -> "equal to"
    }

    println("$number is $comparison 0")
}