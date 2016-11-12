package com.grudus.grammarnazi

fun main(args: Array<String>) {
    println("Witaj w Gramatycznym Naziscie!\n")

    val userInput = "Litwo, ojczyzno moja! Ty jesteś jak zdrowie. Ile Cię trzeba cenić? Ten tylko się dowie, kto Cię stracił."

    GrammarDoctor(LANGUAGE.POLISH, userInput).getSentences().forEach(::println)
}