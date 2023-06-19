import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import exercises.Exercise;
import exercises.CH0TwoDigitNumbersByEleven;
import exercises.CH0SquareTwoDigitNumbersEndingByFive;
import exercises.CH0MultiplicationOfTwoNumbersOfTwoDigits;
import exercises.CH1AdditionOfTwoDigitNumbers;
import exercises.CH1AdditionOfThreeDigitNumbers;
import exercises.CH1SubtractionOfTwoDigitNumbers;
import exercises.CH1SubtractionOfThreeDigitNumbers;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Exercise> exercises = new ArrayList() {{
            add(new CH0TwoDigitNumbersByEleven());
            add(new CH0SquareTwoDigitNumbersEndingByFive());
            add(new CH0MultiplicationOfTwoNumbersOfTwoDigits());
            add(new CH1AdditionOfTwoDigitNumbers());
            add(new CH1AdditionOfThreeDigitNumbers());
            add(new CH1SubtractionOfTwoDigitNumbers());
            add(new CH1SubtractionOfThreeDigitNumbers());
        }};

        int correctAnswers = 0;
        int exercisesToPractice = 50;

        for(int round = 1; round <= exercisesToPractice; round++) {
            Exercise exercise = exercises.get(0);

            System.out.print(exercise.generateExercise() + " = ");

            int response = scanner.nextInt();

            if(exercise.isCorrect(response)) {
                System.out.println("[✓] Correct!");
                correctAnswers++;
            } else {
                System.out.println("[x] Incorrect!, solution: " + exercise.getResponse());
            }

            Collections.shuffle(exercises);
        }

        System.out.println("Results: " + correctAnswers + "/" + exercisesToPractice);
    }
}