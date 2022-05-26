package by.epam.java_intro.stringAndBasicsOfTextProcessing;

/*9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.*/

public class StringPart2Task9 {

    public static int countLowerCaseLetters (String someString) {


        int lowerCase = 0;


        for (int i = 0; i < someString.length(); i++) {

            if (((int)someString.charAt(i)) > 96 && ((int)someString.charAt(i))  < 123 ) {

                lowerCase++;
            }
        }
        return lowerCase;
    }

    public static int countUpperCaseLetters (String someString) {


        int upperCase = 0;


        for (int i = 0; i < someString.length(); i++) {

            if (((int)someString.charAt(i)) > 64 && ((int)someString.charAt(i))  < 91 ) {

                upperCase++;
            }
        }
        return upperCase;
    }


    public static void main (String[] args){

        String someString;

        someString = "In tHe baSe 'раз раз проверка' 10 nuMerAl system.";

        System.out.println("Колличество букв нижнего регистра :" + countLowerCaseLetters(someString)
                + "\n" + "Колличество букв верхнего регистра :"  + countUpperCaseLetters(someString));


    }
}

