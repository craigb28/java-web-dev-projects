package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Question {

    private String questionText;
    private ArrayList<String> PossibleAnswers;

    public Question(String questionText, ArrayList<String> possibleAnswers) {
        this.questionText = questionText;
        this.PossibleAnswers = possibleAnswers;
    }

    //methods

    public void printQuestion(){
        System.out.println(questionText);
    }

    public String collectAnswer(){
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        userInput = scanner.nextLine();
        return userInput;
    }
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<String> getPossibleAnswers() {
        return PossibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        PossibleAnswers = possibleAnswers;
    }
}
