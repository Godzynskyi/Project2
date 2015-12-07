package com.godzynskyi.strings;

/**
 * Point of entry to program.
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

        UniqueWordFromFirstSentenceService service = new UniqueWordFromFirstSentenceService();
        System.out.println(service.getUniqueWordFromFirstSentence(text));

    }
}
