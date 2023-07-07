package exercises.chapter_2;

import java.util.Random;

import exercises.Exercise;

public class ThreeByOneMultiplication extends Exercise {
    @Override
    public String generateExercise() {
        Random random = new Random();

        int threeDigitNumber = random.nextInt(100, 999 + 1);
        int oneDigitNumber = random.nextInt(2, 9 + 1);

        this.setExercise(oneDigitNumber + " x " + threeDigitNumber);
        this.setResponse(oneDigitNumber * threeDigitNumber);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return response == this.getResponse();
    }
}
