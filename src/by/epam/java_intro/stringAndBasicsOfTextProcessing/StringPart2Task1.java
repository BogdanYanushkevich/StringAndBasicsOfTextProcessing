package by.epam.java_intro.stringAndBasicsOfTextProcessing;

  //1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class StringPart2Task1 {

    public static int NumOfSpace (String someString){

        int count;
        int numCount;


        numCount = 0;
        count = 0;


        for (int i = 0; i < someString.length(); i++){

            if (someString.charAt(i) == ' '){
                count++;
                if (numCount < count) { numCount = count;}
            }
            else { count = 0;}




        }
        return numCount;
    }


    public static void main (String [] args){

        String someString;

        someString = "In the    base      10 numeral       system.";

        System.out.println(NumOfSpace(someString));
    }

}
