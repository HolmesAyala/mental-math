package exercises;

import java.util.Random;

public class CH1SubtractionOfTwoDigitNumbers extends Exercise {

    @Override
    public String generateExercise() {
        Random random = new Random();

        int firstNumber = random.nextInt(10, 99);
        int secondNumber = random.nextInt(10, 99);

        this.setExercise(firstNumber + " - " + secondNumber);
        this.setResponse(firstNumber - secondNumber);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return response == this.getResponse();
    }
}
