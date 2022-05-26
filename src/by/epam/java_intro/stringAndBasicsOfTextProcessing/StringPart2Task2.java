package by.epam.java_intro.stringAndBasicsOfTextProcessing;

     //2. В строке вставить после каждого символа 'a' символ 'b'.

public class StringPart2Task2 {


    public static StringBuilder afterAcomesB (String someString) {

        StringBuilder sb = new StringBuilder(someString);

        for (int i = 0; i < sb.length(); i++){


            if (sb.charAt(i) == 'a'){
                sb.insert(i+1, 'b');
            }

        }

        return sb;
    }


    public static void main (String [] args){


        String someString;

        someString = "In the    base      10 numeral       system.";

        System.out.println(afterAcomesB(someString));


    }
}
