package org.launchcode;

import java.util.Scanner;
public class AlicesAdventures {

    public static void main(String[] args) {
        String firstSentence= "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, " +
                "and of having nothing to do: " +
                "once or twice she had peeped into " +
                "the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        String lowercaseFirstSentence = firstSentence.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for: ");

        String searchedTerm = input.nextLine().toLowerCase();

        int index = lowercaseFirstSentence.indexOf(searchedTerm);
        int length = searchedTerm.length();

        System.out.println("The sentence contains your search term: " +lowercaseFirstSentence.contains(searchedTerm));


        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchedTerm, "");
        System.out.println(modifiedSentence);

    }
}
