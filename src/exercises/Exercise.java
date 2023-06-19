package exercises;

public abstract class Exercise {
    private String exercise;
    private int response;

    public abstract String generateExercise();

    public abstract boolean isCorrect(int response);

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }
}
