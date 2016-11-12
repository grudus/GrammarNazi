import parts_of_sentence.Sentence

class GrammarDoctor(val originalText: String) {

    val sentences: MutableCollection<Sentence> = mutableListOf()

    init {
        textToSentences()
    }

    fun textToSentences() {
        originalText.trim()
                .split(".", "!", "?", ";")
                .map { Sentence(it.trim()) }
                .toCollection(sentences)
    }

    fun getCorrectedText(): String = originalText

}
