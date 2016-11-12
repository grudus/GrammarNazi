fun main(args: Array<String>) {
    println("Witaj w Gramatycznym Naziscie!")

    val userInput = "Litwo, ojczyzno moja! Ty jesteś jak zdrowie. Ile Cię trzeba cenić? Ten tylko się dowie, kto Cię stracił."

    val grammarDoctor = GrammarDoctor(userInput)

    grammarDoctor.sentences.forEach(::println)

}