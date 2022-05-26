package by.epam.java_intro.stringAndBasicsOfTextProcessing;

 //5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class StringPart2Task5 {

    public static int aCount (String someString) {

        int count;

        count = 0;

        for (int i = 0; i < someString.length(); i++){

            if (someString.charAt(i) == 'a'){
                count++;
            }

        }
        return count;
    }




    public static void main (String[] args){

        String someString;

        someString = "In the base 10 numeral system.";

        System.out.println(aCount(someString));


    }
}
