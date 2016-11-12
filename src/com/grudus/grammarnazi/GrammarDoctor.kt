package com.grudus.grammarnazi

class GrammarDoctor(language: LANGUAGE, originalText: String) {

    private val text = LanguageFactory().getTextForLanguage(language, originalText)

    fun getSentences() = text.sentences

}
