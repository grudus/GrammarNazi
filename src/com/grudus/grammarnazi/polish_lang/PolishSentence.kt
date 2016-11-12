package com.grudus.grammarnazi.polish_lang

import com.grudus.grammarnazi.abstract_lang.Sentence
import com.grudus.grammarnazi.abstract_lang.Word
import java.util.regex.Pattern


class PolishSentence(val text: String) : Sentence(text) {

    override val words: MutableCollection<Word> = mutableListOf()

    init {
        findWords()
    }

    override fun findWords() {
        text.split(Pattern.compile("\\s+"))
                .map(::PolishWord)
                .toCollection(words)
    }


}