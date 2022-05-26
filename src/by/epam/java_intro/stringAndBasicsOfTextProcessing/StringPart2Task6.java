package by.epam.java_intro.stringAndBasicsOfTextProcessing;

//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class StringPart2Task6 {

    public static StringBuilder doobleSymbol (String someString) {

        StringBuilder sb = new StringBuilder(someString);

        for (int i = 0; i < sb.length(); i+=2){

            sb.insert(i, sb.charAt(i));


        }
        return sb;
    }




    public static void main (String[] args){

        String someString;

        someString = "In the base 10 numeral system.";

        System.out.println(doobleSymbol(someString));


    }
}
