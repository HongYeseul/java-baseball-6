package baseball.model.master;

import static baseball.model.constants.GameRule.NUMBER_COUNT;
import static baseball.model.constants.ResultFormat.FORMAT_INT_STRING;
import static baseball.model.constants.ResultFormat.FORMAT_INT_STRING_WITH_BLANK;

public enum Result {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱");

    private final String name;

    Result(String name){
        this.name = name;
    }

    public static String makeResultToString(int strike, int ball) {
        if (strike == NUMBER_COUNT) {
            return String.format(FORMAT_INT_STRING, NUMBER_COUNT, STRIKE.name);
        }
        if (strike > 0 && ball > 0) {
            return String.format(FORMAT_INT_STRING_WITH_BLANK, ball, BALL.name, strike, STRIKE.name);
        }
        if (strike == 0 && ball > 0) {
            return String.format(FORMAT_INT_STRING, ball, BALL.name);
        }
        if (strike > 0 && ball == 0) {
            return String.format(FORMAT_INT_STRING, strike, STRIKE.name);
        }
        return NOTHING.name;
    }
}
