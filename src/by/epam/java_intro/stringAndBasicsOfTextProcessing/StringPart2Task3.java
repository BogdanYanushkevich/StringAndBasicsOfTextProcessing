package by.epam.java_intro.stringAndBasicsOfTextProcessing;

    //3. Проверить, является ли заданное слово палиндромом.

public class StringPart2Task3 {

    public static String isPalindrome (String someString) {

        String palindrome;
        StringBuilder sb = new StringBuilder(someString);

        palindrome = "This word is not a palindrome.";

        if (someString.equalsIgnoreCase(sb.reverse().toString()) ){
            palindrome = "This word is a palindrome.";
        }

        return palindrome;
    }

    public static void main (String [] args){


        String someString;

        someString = "abBa";

        System.out.println(isPalindrome(someString));

    }
}
