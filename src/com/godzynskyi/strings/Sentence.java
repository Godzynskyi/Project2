package com.godzynskyi.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Java Developer on 07.12.2015.
 */
public class Sentence {
    String sentence;

    List<Word> words = new ArrayList<Word>();

    public Sentence(String sentence) {
        this.sentence = sentence;
        parseSentence();
        TaskService.getInstance().listen(this);
    }

    public void parseSentence() {
//        String[] wordsString = sentence.split("[,;]?(\\s*-*\\s+)");
        String[] wordsString = sentence.split("\\W+");

        for (String s: wordsString) {
            words.add(new Word(s.toLowerCase()));
        }
    }

    public List<Word> getWords() {
        return words;
    }
}
