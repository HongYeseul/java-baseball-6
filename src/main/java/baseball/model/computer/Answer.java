package baseball.model.computer;

import baseball.model.user.TryNumber;

import java.util.List;

import static baseball.model.constants.GameRule.NUMBER_COUNT;

public class Answer {
    List<Integer> answer;

    public Answer(List<Integer> randomNumbers) {
        answer = randomNumbers;
    }

    public boolean isStrike(TryNumber userNumber) {
        return answer.equals(userNumber.getNumbers());
    }

    public boolean isStrikeByIndex(TryNumber userNumber, int index) {
        return answer.get(index).equals(userNumber.getNumberByIndex(index));
    }

    public int getBallByIndex(TryNumber userNumber, int index) {
        int ball = 0;
        for (int i = 0; i < NUMBER_COUNT; i++) {
            if (index == i) {
                continue;
            }
            if (answer.get(index) == userNumber.getNumberByIndex(i)) {
                ball++;
            }
        }
        return ball;
    }
}
