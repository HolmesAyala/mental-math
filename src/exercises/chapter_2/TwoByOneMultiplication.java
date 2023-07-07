package exercises.chapter_2;

import exercises.Exercise;

import java.util.Random;

public class TwoByOneMultiplication extends Exercise {
    @Override
    public String generateExercise() {
        Random random = new Random();

        int oneDigitNumber = random.nextInt(2, 9 + 1);
        int twoDigitNumber = random.nextInt(10, 99);

        this.setExercise(oneDigitNumber + " x " + twoDigitNumber);
        this.setResponse(oneDigitNumber * twoDigitNumber);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return response == this.getResponse();
    }
}
