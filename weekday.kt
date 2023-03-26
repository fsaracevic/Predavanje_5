fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Please provide a day of the week")
        return
    }

    val dayOfWeek = args[0].toLowerCase()

    val isWeekend = when (dayOfWeek) {
        "monday", "tuesday", "wednesday", "thursday", "friday" -> false
        "saturday", "sunday" -> true
        else -> {
            println("Please provide a day of the week")
            return
        }
    }

    val dayType = if (isWeekend) "weekend day" else "workday"
    println("$dayOfWeek is a $dayType")
}