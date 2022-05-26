package by.epam.java_intro.stringAndBasicsOfTextProcessing;

   // 3. В строке найти количество цифр.

public class StringPart1Task3 {

    //Метод находит и подсчитывает все числа в строке.


    /* public static int searchNumber(String someString) {

        someString = someString.replaceAll("\\D+", " ");
        return someString.trim().split(" ").length;
    }   */

    public static int searchNumber (String someString) {

        int countNum;

        countNum = 0;

        for (int i = 0; i < someString.length(); i++)

            if (Character.isDigit(someString.charAt(i))){
                countNum++;
            }


        return countNum;
    }


    public static void main(String[] args) {

        String someString;

        someString = "In the base 10 numeral system, in almost universal use today for mathematical operations," +
                     " the symbols for natural numbers are written using ten digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, and 9.";

        System.out.println(searchNumber(someString));

    }
}
