package baseball.model.computer;

public class Computer {
    Answer answer;

    public Computer() {
        answer = Random.makeAnswer();
    }

    public Answer getAnswer() {
        return answer;
    }
}
