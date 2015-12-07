package com.godzynskyi.strings;

/**
 * Created by Java Developer on 07.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        String s = "public boolean equals(Object o) {\n" +
                "        if (this == o) return true;\n" +
                "        if (o == null || getClass() != o.getClass()) return false;\n" +
                "\n" +
                "        Word word1 = (Word) o.\n" +
                "\n" +
                "        if (!word.equals(word1.word)) return false;\n" +
                "\n" +
                "        return true;\n" +
                "    }";
        Text text = new Text(s);
        System.out.println(TaskService.getInstance().getUniqueWordFromFirstSentence());

    }
}
