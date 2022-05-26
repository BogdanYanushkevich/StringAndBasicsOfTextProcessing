package by.epam.java_intro.stringAndBasicsOfTextProcessing;


/* 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать текст по абзацам в зависимости от количества предложений в каждом абзаце от меньшего колличества к большему; В каждом предложении отсортировать слова по колличеству символов;
отсортировать лексемы в предложении по убыванию количества вхождений выбранного символа, а в случае равенства количества – отсортировать по первой букве
алфавита.*/

import java.util.Scanner;
import java.util.Arrays;

public class StringPart3Task1 {

    public static void main(String[] args) {

        String someString = "My name is Bogdan. I am 24 years old.\n" +
                "I was born in the city of Baranovichi.\n" +
                "Studied at lyceum number 1. My wife's name is Ira. We are pleased to meet you.";

        someString = menu(someString);

        System.out.println(someString);

    }

    public static String menu(String someString) {


        Scanner scanner = new Scanner(System.in);
        int choice = 0;


        do {
            System.out.println("Выберите действие : ");
            System.out.println("1. Сортировка по количеству предложений в абзаце.");
            System.out.println("2. Сортировка по количеству символов в предложении.");
            System.out.println("3. Сортировка по количеству вхождений выбранного символа в предложении.");
            System.out.println("4. Выход.");

            while (!scanner.hasNextInt()) {
                System.out.println("Выберите действие : ");
                System.out.println("1. Сортировка по количеству предложений в абзаце.");
                System.out.println("2. Сортировка по количеству символов в предложении.");
                System.out.println("3. Сортировка по количеству вхождений выбранного символа в предложении.");
                System.out.println("4. Выход.");

                scanner.next();

            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sortParagraphs(someString);
                    break;
                case 2:
                    sortSentences(someString);
                    break;
                case 3:
                    sortWords(someString);
                    break;
                case 4:
                    exit();

                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
        while (choice != 5);

        return someString;
    }


    //Сортировка абзацев по количеству предложений.
    public static String sortParagraphs(String someString) {

        String[] paragraphs = someString.split("\n");
        int[] sentencesCounter = new int[paragraphs.length];
        int max = 0;


        for (int i = 0; i < paragraphs.length; i++) {

            String[] sentences = paragraphs[i].split("[.!?]");
            sentencesCounter[i] = sentences.length;

            if (sentencesCounter[i] > max) {
                max = sentencesCounter[i];
            }
        }

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < sentencesCounter.length; j++) {
                if (sentencesCounter[j] == i) {
                    System.out.println(paragraphs[j]);
                }
            }

        }
        System.out.println("\n");


        return "";
    }

    //В каждом предложении отсортировать слова по длине.

    public static String sortSentences(String someString) {

        String[] sentences = someString.split("[.!?]");

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            String[] sortedWords = new String[words.length];

            for (int j = 0; j < words.length; j++) {
                sortedWords[j] = words[j];
            }

            for (int j = 0; j < words.length; j++) {
                for (int k = j + 1; k < words.length; k++) {
                    if (sortedWords[j].length() > sortedWords[k].length()) {
                        String temp = sortedWords[j];
                        sortedWords[j] = sortedWords[k];
                        sortedWords[k] = temp;
                    }
                }
            }

            for (int j = 0; j < words.length; j++) {
                System.out.print(sortedWords[j] + " ");
            }
            System.out.println();

        }
        System.out.println("\n");

        return "";
    }


    /*Отсортировать лексемы в предложении по убыванию количества вхождений выбранного символа, а в случае равенства количества – отсортировать по первой букве
    алфавита.*/

    public static String sortWords(String someString) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ, по которому нужно отсортировать лексемы в предложении");
        String symbol = scanner.nextLine();
        int symbolCount = 0;
        int symbolCountMax = 0;


        String[] sentences = someString.split("[.!?]");


            for (String sentence : sentences) {

                String[] words = (sentence.split(" "));

                for (int i = words.length - 1; i >= 0; i--) {

                    for (int j = 0; j < i; j++) {

                        int count1 = 0;
                        int count2 = 0;

                        for (int n = 0; n < words[j].length(); n++) {

                            if (String.valueOf(words[j].charAt(n)).compareTo(symbol) == 0) {
                                count2++;
                            }
                        }
                        for (int n = 0; n < words[j + 1].length(); n++) {

                            if (String.valueOf(words[j + 1].charAt(n)).compareTo(symbol) == 0) {
                                count1++;
                            }
                        }
                        if (count2 < count1) {
                            String temp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = temp;

                        } else if (count1 == count2 && count1 != 0) {
                            String[] compare = {words[j], words[j + 1]};
                            Arrays.sort(compare);
                            words[j] = compare[0];
                            words[j + 1] = compare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();

            return "";
        }









    // Выход из приложения
    public static void exit() {
        System.out.println("Выход из приложения");
        System.exit(0);
    }
}

