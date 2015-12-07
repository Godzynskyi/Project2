package com.godzynskyi.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * This entity class defines text and parse it to Sentences {@link }
 */
public class Text {

    List<Sentence> sentences = new ArrayList<Sentence>();

    public Text(String text) {
        parseToSentences(text);
    }

    private void parseToSentences(String text) {
        String[] sents = text.split("[.?!]\\s+");
        for (String s : sents) {
            sentences.add(new Sentence(s));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }
}
