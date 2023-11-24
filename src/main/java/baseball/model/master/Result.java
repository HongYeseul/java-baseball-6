package baseball.model.master;

public enum Result {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱");

    private final String name;

    Result(String name){
        this.name = name;
    }

    public static String makeResultToString(int strike, int ball) {
        if (strike == 3) {
            return "3"+STRIKE.name;
        }
        if (strike > 0 && ball > 0) {
            return strike + STRIKE.name + ball + BALL.name;
        }
        if (strike == 0 && ball > 0) {
            return ball + BALL.name;
        }
        if (strike > 0 && ball == 0) {
            return strike + STRIKE.name;
        }
        return NOTHING.name;
    }
}
