package by.epam.java_intro.stringAndBasicsOfTextProcessing;
import java.util.regex.*;

   //4. В строке найти количество чисел.

public class StringPart1Task4 {

    //Метож ищет и возвращает колличество чисел в строке.

    public static int numQuantity (String someString) {

        int count;
        Pattern p;
        Matcher m;

        p = Pattern.compile("(\\d+)");
        m = p.matcher(someString);
        count = 0;


        while (m.find()) {
            count++;
        }

        return count;
    }


    public static void main(String[] args) {

        String someString = "We had 2 bags of weed, 75 ampoules of mescaline, 5 bags " +
                "of lysergic acid diethylamide or LSD, a 1 salt shaker half-filled with cocaine...";



        System.out.println("Количество чисел: " + numQuantity(someString));


    }
}




