package com.grudus.grammarnazi.abstract_lang

import com.grudus.grammarnazi.polish_lang.PolishSentence


abstract class Text(val text: String) {

    abstract val sentences: MutableCollection<PolishSentence>

    abstract fun findSentences()

    override fun toString() = text
}