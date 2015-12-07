package com.godzynskyi.strings;


import java.util.HashSet;
import java.util.Set;

/**
 * Service to do next:
 *
 * Найти такое слово в первом предложении,
 * которого нет ни в одном из остальных предложений.
 *
 * <p>Listen for sentences by method {@link #listen(com.godzynskyi.strings.Sentence sentence)}. <br>
 * After that one of the unique words would be returned by method {@link #getUniqueWordFromFirstSentence()}
 *
 */
public class UniqueWordFromFirstSentenceService {
    private boolean firstSentence = true;
    private Set<Word> uniqueWordsFromFirstSentence = new HashSet<Word>();

    /**
     * Create <tt>Set</tt> of words from first sentence.
     * Removes words from this <tt>Set</tt> when anyone appears in other sentences.
     *
     * One of the unique words would be returned by method {@link #getUniqueWordFromFirstSentence()}
     *
     * @param sentence sentence for handling
     */
    void listen(Sentence sentence) {
        if (firstSentence) {
            firstSentence = false;
            for (Word w: sentence.getWords()) {
                uniqueWordsFromFirstSentence.add(w);
            }
        }
        // Other sentences
        else {
            if (!uniqueWordsFromFirstSentence.isEmpty()) {
                for (Word w : sentence.words) {
                    uniqueWordsFromFirstSentence.remove(w);
                }
            }
        }
    }

    /**
     * Invoke this method after invoking {@link #listen(com.godzynskyi.strings.Sentence sentence)} for all sentences.
     *
     * @return one of the unique words from first sentence <br>
     *      or <tt>null</tt> if there no words.
     */
    String getUniqueWordFromFirstSentence() {
        for (Word res: uniqueWordsFromFirstSentence) {
            return res.getWord();
        }
        return null;
    }

    /**
     * Returns word from first sentence of the text, that doesn't appear in other sentences.
     *
     * @return unique word from first sentence
     */
    public String getUniqueWordFromFirstSentence(Text text) {
        for (Sentence sentences: text.getSentences()) {
            listen(sentences);
        }
        return getUniqueWordFromFirstSentence();
    }
}
