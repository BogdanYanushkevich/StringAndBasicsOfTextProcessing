package by.epam.java_intro.stringAndBasicsOfTextProcessing;


//2. Замените в строке все вхождения 'word' на 'letter'.


public class StringPart1Task2 {

    //Метод заменяет все выбранные слова на заданное слово.

    public static String replaceAllWord(String someString, String someWord, String replaceWord) {

        String result;

        result = someString.replaceAll(someWord, replaceWord);


        return result;
    }


    public static void main(String[] args) {

        String line;
        String repWord;
        String wordToRep;

        line = "The word has power. A word can hurt in one case and a word can warm in another.";
        repWord = "word";
        wordToRep = "letter";

        System.out.println(replaceAllWord(line, repWord, wordToRep));


    }
}
