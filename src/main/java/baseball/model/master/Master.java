package baseball.model.master;

import baseball.model.computer.Answer;
import baseball.model.user.TryNumber;

import static baseball.model.constants.GameRule.NUMBER_COUNT;
import static baseball.model.constants.GameRule.WANT_RESTART;

public class Master {
    private int strike;
    private int ball;

    public void gameSetting() {
        strike = 0;
        ball = 0;
    }

    public String makeResult(Answer answer, TryNumber userNumber) {
        gameSetting();
        if (answer.isStrike(userNumber)) {
            strike = NUMBER_COUNT;
            return Result.makeResultToString(strike, ball);
        }
        for (int i = 0; i < NUMBER_COUNT; i++) {
            if (answer.isStrikeByIndex(userNumber, i)) {
                strike++;
                continue;
            }
            ball += answer.getBallByIndex(userNumber, i);
        }
        return Result.makeResultToString(strike, ball);
    }

    public boolean isGameRestart(int flag) {
        return flag == WANT_RESTART;
    }

    public boolean isGameEnd() {
        return strike != NUMBER_COUNT;
    }

}
