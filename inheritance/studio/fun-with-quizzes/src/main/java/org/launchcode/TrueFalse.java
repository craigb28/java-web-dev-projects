package org.launchcode;

import java.util.ArrayList;

public class TrueFalse extends Question {

    private Boolean correctAnswer;
    public TrueFalse(String questionText, ArrayList<String> possibleAnswers, Boolean correctAnswer) {
        super(questionText, possibleAnswers);
        this.correctAnswer = correctAnswer;
    }

    public void gradeTheAnswer(String userInput){
        if(userInput.equals(correctAnswer.toString())){
            System.out.println("Correct!");
        };
    }

}
