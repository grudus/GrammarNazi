import parts_of_sentence.Word

class GrammarDoctor(val originalText : String) {

    var partsOfSentence : MutableCollection<Word> = mutableListOf()

    fun splitSentence() {
        var splitted = originalText.split("\\s+")

        partsOfSentence = splitted.map(::Word).toCollection(partsOfSentence)

    }

    fun getCorrectedText() : String = originalText

}
