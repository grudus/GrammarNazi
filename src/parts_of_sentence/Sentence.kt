package parts_of_sentence

import java.util.regex.Pattern

class Sentence(val sentence: String) {

    val partsOfSentence : MutableCollection<Word> = mutableListOf()

    init {
        splitSentence()
    }

    fun splitSentence() {
        sentence.split(Pattern.compile("\\s+"))
                .map{Word(it.trim())}
                .toCollection(partsOfSentence)

    }

    override fun toString() = partsOfSentence.toString()


}