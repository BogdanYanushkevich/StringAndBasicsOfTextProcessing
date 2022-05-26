package by.epam.java_intro.stringAndBasicsOfTextProcessing;

/*8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.*/

public class StringPart2Task8 {

    public static String longestWord (String someString) {


        String[] words;
        String longestWord;

        words = someString.split(" ");
        longestWord = " ";


        for (int i = 0; i < words.length - 1; i++) {

            if (words[i].length() > longestWord.length()) {

                longestWord =  words[i];
            }
        }
        return longestWord;
    }


    public static void main (String[] args){

        String someString;

        someString = "In the base 10 numeral system.";

        System.out.println(longestWord(someString));


    }
}
