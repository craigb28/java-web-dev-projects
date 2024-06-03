package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
//Divide (4,0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        HashMap<String, Integer> studentScores = new HashMap<>();
//         Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            int studentScore = CheckFileExtension(student.getValue());
            studentScores.put(student.getKey(), studentScore);
            System.out.println(studentScores);
        }
    }

//    public static void Divide(int x, int y) {
//        try {
//            if (y == 0) {
//
//                throw new ArithmeticException("Cannot divide by zero!");
//            }
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//
//    }

    public static int CheckFileExtension(String fileName) {
//         Write code here!
        try {
            if (fileName == null || fileName.isEmpty()) {

                throw new Exception("File extension is not compatible, or does not exist.");
            }
        } catch (Exception e) {

            e.printStackTrace();
            return -1;
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}