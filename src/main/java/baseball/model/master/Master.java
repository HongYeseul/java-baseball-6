package baseball.model.master;

import baseball.model.computer.Answer;
import baseball.model.user.TryNumber;

public class Master {
    private int strike;
    private int ball;

    public Master() {
        strike = 0;
        ball = 0;
    }

    public void gameSetting() {
        strike = 0;
        ball = 0;
    }

    public String makeResult(Answer answer, TryNumber userNumber) {
        gameSetting();
        if (answer.isStrike(userNumber)) {
            strike = 3;
            return Result.makeResultToString(strike, ball);
        }
        for (int i = 0; i < 3; i++) {
            if (answer.isStrikeByIndex(userNumber, i)) {
                strike++;
                continue;
            }
            ball += answer.getBallByIndex(userNumber, i);
        }
        return Result.makeResultToString(strike, ball);
    }

    public boolean isGameRestart(int flag) {
        return flag == 1;
    }

    public boolean isGameEnd() {
        return strike != 3;
    }

}
