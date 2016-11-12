package com.grudus.grammarnazi.abstract_lang

abstract class Sentence(val sentence: String) {

    abstract val words : MutableCollection<Word>

    abstract fun findWords()

    override fun toString() = words.toString()
}