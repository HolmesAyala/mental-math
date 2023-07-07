package exercises;

import java.util.Random;

public class CH1AdditionOfThreeDigitNumbers extends Exercise {
    @Override
    public String generateExercise() {
        Random random = new Random();

        int firstNumber = random.nextInt(100, 999 + 1);
        int secondNumber = random.nextInt(100, 999 + 1);

        this.setExercise(firstNumber + " + " + secondNumber);
        this.setResponse(firstNumber + secondNumber);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return response == this.getResponse();
    }
}
