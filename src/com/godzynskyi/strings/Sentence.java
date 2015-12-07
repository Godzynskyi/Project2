package com.godzynskyi.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity class defines Sentence of a text.
 */
public class Sentence {
    List<Word> words = new ArrayList<Word>();

    public Sentence(String sentence) {
        parseToWords(sentence);
    }

    private void parseToWords(String sentence) {
        String[] wordsString = sentence.split("\\W+");

        for (String s: wordsString) {
            words.add(new Word(s.toLowerCase()));
        }
    }

    public List<Word> getWords() {
        return words;
    }
}
