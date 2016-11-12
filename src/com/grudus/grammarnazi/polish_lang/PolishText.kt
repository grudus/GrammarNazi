package com.grudus.grammarnazi.polish_lang

import com.grudus.grammarnazi.abstract_lang.Text

class PolishText(text: String) : Text(text) {

    override val sentences: MutableCollection<PolishSentence> = mutableListOf()

    init {
        findSentences()
    }

    override fun findSentences() {
        text.trim()
                .split("!", "?", ".", ";")
                .map {PolishSentence(it.trim())}
                .toCollection(sentences)
    }

}