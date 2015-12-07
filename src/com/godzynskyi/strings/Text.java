package com.godzynskyi.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Java Developer on 07.12.2015.
 */
public class Text {
    String text;

    List<Sentence> sentences = new ArrayList<Sentence>();

    public Text(String text) {
        this.text = text;
        parseToSentences();
    }

    public void parseToSentences() {
        String[] sents = text.split("[.?!]\\s+");
        for (String s : sents) {
            sentences.add(new Sentence(s));
        }
    }

}
