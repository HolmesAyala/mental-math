package exercises;

import java.util.Random;

public class CH1AdditionOfTwoDigitNumbers extends Exercise {
    @Override
    public String generateExercise() {
        Random random = new Random();

        int firstNumber = random.nextInt(10, 99 + 1);
        int secondNumber = random.nextInt(10, 99 + 1);

        this.setExercise(firstNumber + " + " + secondNumber);
        this.setResponse(firstNumber + secondNumber);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return response == this.getResponse();
    }
}
