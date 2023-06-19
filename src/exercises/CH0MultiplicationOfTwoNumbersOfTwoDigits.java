package exercises;

import java.util.Random;

/**
 * The first digit of those numbers is equals and the second digit sums 10.
 */
public class CH0MultiplicationOfTwoNumbersOfTwoDigits extends Exercise {
    @Override
    public String generateExercise() {
        Random random = new Random();

        int firstDigit = random.nextInt(1, 9 + 1);

        int secondDigitOfFirstNumber = random.nextInt(1, 9 + 1);
        int secondDigitOfSecondNumber = 10 - secondDigitOfFirstNumber;

        int firstNumber = firstDigit * 10 + secondDigitOfFirstNumber;
        int secondNumber = firstDigit * 10 + secondDigitOfSecondNumber;

        this.setExercise(firstNumber + " x " + secondNumber);
        this.setResponse(firstNumber * secondNumber);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return response == this.getResponse();
    }
}
