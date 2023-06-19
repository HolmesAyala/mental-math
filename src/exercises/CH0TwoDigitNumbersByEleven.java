package exercises;

import java.util.Random;

public class CH0TwoDigitNumbersByEleven extends Exercise {

    @Override
    public String generateExercise() {
        Random random = new Random();

        int twoDigitNumber = random.nextInt(10, 99 + 1);

        this.setExercise(twoDigitNumber + " x 11");
        this.setResponse(twoDigitNumber * 11);

        return this.getExercise();
    }

    @Override
    public boolean isCorrect(int response) {
        return response == this.getResponse();
    }
}
