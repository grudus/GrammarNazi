package com.grudus.grammarnazi

import com.grudus.grammarnazi.abstract_lang.Text
import com.grudus.grammarnazi.polish_lang.PolishText

enum class LANGUAGE {
    POLISH
}

class LanguageFactory {

    fun getTextForLanguage(language : LANGUAGE, text: String): Text {
        when (language) {
            LANGUAGE.POLISH -> return PolishText(text)
        }
    }
}
