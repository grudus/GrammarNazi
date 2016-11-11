fun main(args: Array<String>) {
    println("Witaj w Gramatycznym Naziscie! Wprowadz zdanie:")

    val userInput = readLine()

    val grammarDoctor = GrammarDoctor(userInput!!)

    println("Podales: $userInput \nPoprawna forma tego zdania to: ${grammarDoctor.getCorrectedText()}")

}