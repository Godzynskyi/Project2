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
        TaskService taskService = new TaskService();
        for (Sentence sentences: text.getSentences()) {
            taskService.listen(sentences);
        }
        System.out.println(taskService.getUniqueWordFromFirstSentence());

    }
}
