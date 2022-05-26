package by.epam.java_intro.stringAndBasicsOfTextProcessing;
import java.util.Arrays;


    // 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.


public class StringPart1Task1 {


    // Метод заменяет стиль с camelCase на snake_case.

    public static String replaceCamelToSnake (String camel){

        String regex = "([a-z])([A-Z])";
        String replacement = "$1_$2";

        return camel.replaceAll(regex, replacement).toLowerCase();

    }

    // Метод заменяет стиль с camelCase на snake_case в целом массиве.

    public static String[] replaceCamelToSnakeinArr (String[] arr){

        for (int i = 0; i < arr.length; i++){

            arr[i] = replaceCamelToSnake(arr[i]);
        }

        return arr;
    }


        public static void main(String[] args) {

            String[] someStrings = {"OneTwo", "SnakeCase", "CamelCase"};


            System.out.println(Arrays.toString(replaceCamelToSnakeinArr(someStrings)));
        }
    }


