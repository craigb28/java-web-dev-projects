package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static String printWords(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int wordLength = input.nextInt();
        String wordsPrinted = "";
        for (String word : arr) {
            if (word.length() == wordLength) {
                wordsPrinted = wordsPrinted.concat(word + ", ");
            }
        }
        return wordsPrinted;

    }

    public static void main(String[] args) {
//        ArrayList<Integer> integerList = new ArrayList<>(List.of(0, 1, 3, 45, 12, 3, 57, 70, 101, 12));
//        System.out.println(sumEven(integerList));
        ArrayList<String> wordList = new ArrayList<>(List.of("catch", "hotdog", "baseball", "shark", "chunk"));
        System.out.println(printWords(wordList));
    }
}
