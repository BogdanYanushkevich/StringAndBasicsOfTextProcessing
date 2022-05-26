package by.epam.java_intro.stringAndBasicsOfTextProcessing;
import java.util.regex.*;


   /*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
   Крайние пробелы в строке удалить.*/


public class StringPart1Task5 {


    public static String delSpace (String someString) {

        String stringWithoutDel;

        stringWithoutDel = someString.trim().replaceAll("\s+", " ");


       return stringWithoutDel;
    }




    public static void main(String[] args) {


        String someString;

        someString = "  In    this   line,    we    will remove   extra  space     characters.   ";

        System.out.println(delSpace(someString));
    }

}
