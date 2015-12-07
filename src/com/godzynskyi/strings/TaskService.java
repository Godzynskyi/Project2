package com.godzynskyi.strings;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Java Developer on 07.12.2015.
 */
public class TaskService {
    private static TaskService instance = new TaskService();
    private boolean firstSentence = true;
    private Set<Word> uniqueWordsFromFirstSentence = new HashSet<Word>();

    private TaskService() {}

    public static TaskService getInstance() {
        return instance;
    }


    /**
     * Create <tt>Set</tt> of words from first sentence.
     * Removes words from this <tt>Set</tt> when anyone appears in other sentences.
     *
     * One of the unique words would be returned by method {@link #getUniqueWordFromFirstSentence()} .
     *
     * @param sentence sentence for handling
     */
    public void listen(Sentence sentence) {
        if (firstSentence) {
            firstSentence = false;
            for (Word w: sentence.getWords()) {
                uniqueWordsFromFirstSentence.add(w);
            }
        }
        // Other sentences
        else {
            for (Word w: sentence.words) {
                uniqueWordsFromFirstSentence.remove(w);
            }
        }
    }

    /**
     * Invoke this method after invoking {@link #listen(com.godzynskyi.strings.Sentence sentence)} for all sentences.
     *
     * @return one of the unique words from first sentence <br>
     *      or <tt>null</tt> if there no words.
     */
    public String getUniqueWordFromFirstSentence() {
        for (Word res: uniqueWordsFromFirstSentence) {
            return res.getWord();
        }
        return null;
    }
}
