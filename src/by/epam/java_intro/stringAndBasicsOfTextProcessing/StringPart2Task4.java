package by.epam.java_intro.stringAndBasicsOfTextProcessing;

/*4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.*/

public class StringPart2Task4 {

    public static String compSciToCake (String someString){

        String tLetter;
        String orLetter;
        String word;

        tLetter = String.copyValueOf(someString.toCharArray(),7 , 1);
        orLetter = String.copyValueOf(someString.toCharArray(),3 , 2);

        word = tLetter + orLetter + tLetter;



        return word;
    }


    public static void main (String [] args){


        String someString;

        someString = "информатика";

        System.out.println(compSciToCake(someString));

    }
}
