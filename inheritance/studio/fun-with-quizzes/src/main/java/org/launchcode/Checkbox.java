package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{

private String textOfQuestion;
private ArrayList<String> correctAnswers;

// Constructor
    public Checkbox(String questionText, ArrayList<String> possibleAnswers, ArrayList<String> correctAnswers) {
        super(questionText, possibleAnswers);
        this.correctAnswers = correctAnswers;
    }

    public void printPossibleAnswers(){
        System.out.println(getPossibleAnswers());
    }

    @Override
    public String collectAnswer(){
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            userInput += scanner.nextLine();
        } while (scanner.hasNextLine());
        return userInput;
    }
}
