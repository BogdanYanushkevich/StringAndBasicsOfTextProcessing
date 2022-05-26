package by.epam.java_intro.stringAndBasicsOfTextProcessing;

/*7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".*/

public class StringPart2Task7 {

    public static StringBuilder delCoppySymbol (String someString) {

        StringBuilder sb = new StringBuilder(someString.toLowerCase());


        for (int i = 0; i < sb.length(); i++){

            for (int j = sb.length()-1; j > i; j--){

                if(sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j); }

                }
            }



        return sb;
    }




    public static void main (String[] args){

        String someString;

        someString = "aabbbccdeeeeffggggaAbBcC";

        System.out.println(delCoppySymbol(someString));


    }
}
