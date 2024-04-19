package org.launchcode;

import java.util.ArrayList;

public class Quiz {

    public static void main(String[] args) {
//        ArrayList<String> possibleAnswers = new ArrayList<String>();
//        possibleAnswers.add("true");
//        possibleAnswers.add("false");
//        TrueFalse trueOrFalse = new TrueFalse("Is the sky blue? ", possibleAnswers, true);
//
//        trueOrFalse.printQuestion();
//
//        String userInput = trueOrFalse.collectAnswer();
//        System.out.println(userInput);

        ArrayList<String> possibleAnswers = new ArrayList<>();
        possibleAnswers.add("Raphael");
        possibleAnswers.add("Donatello");
        possibleAnswers.add("Michael");
        possibleAnswers.add("Leonardo");
        possibleAnswers.add("Bob");

        ArrayList<String> correctAnswers = new ArrayList<>();
        possibleAnswers.add("Raphael");
        possibleAnswers.add("Donatello");
        possibleAnswers.add("Michael");
        possibleAnswers.add("Leonardo");

        Checkbox checkBox = new Checkbox("What are the names of the Ninja Turtles? ", possibleAnswers, correctAnswers);

        checkBox.printQuestion();
        checkBox.printPossibleAnswers();
        checkBox.collectAnswer();

    }
    // methods
//public void addQuestion(){
//}

    // To add questions
    // To run the quiz
    // To auto-grade the answers
}
