package exercises.chapter_2;

import java.util.Random;

import exercises.Exercise;

public class SquareTwoDigitNumbers extends Exercise {
    @Override
    public String generateExercise() {
        Random random = new Random();

        int number = random.nextInt(10, 99 + 1);

        this.setExercise(number + " ^ 2");
        this.setResponse(number * number);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return this.getResponse() == response;
    }
}
