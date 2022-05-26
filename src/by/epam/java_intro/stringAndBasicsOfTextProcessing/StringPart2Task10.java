package by.epam.java_intro.stringAndBasicsOfTextProcessing;

/*10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X. */


public class StringPart2Task10 {


    public static int sentenceCounter (String someString) {


        int sentenceCounter = 0;


        for (int i = 0; i < someString.length(); i++) {

            if (someString.charAt(i) == '!' || someString.charAt(i) == '?' || someString.charAt(i) == '.' ) {

                sentenceCounter++;
            }
        }
        return sentenceCounter;
    }


    public static void main (String[] args){

        String someString;

        someString = "Line X consists of several sentences. Each of which ends with a dot, exclamation or interrogative\n" +
                "sign! Determine the number of sentences in line X?";

        System.out.println("Колличество предложений в строке ровняется : " + sentenceCounter(someString));


    }
}
