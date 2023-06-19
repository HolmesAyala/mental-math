package exercises;

import java.util.Random;

public class CH0SquareTwoDigitNumbersEndingByFive extends Exercise {
    @Override
    public String generateExercise() {
        Random random = new Random();

        int firstDigit = random.nextInt(1, 9 + 1);
        int twoDigitNumber = Integer.parseInt(firstDigit + "5");

        this.setExercise(twoDigitNumber + " x " + twoDigitNumber);
        this.setResponse(twoDigitNumber * twoDigitNumber);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return response == this.getResponse();
    }
}
