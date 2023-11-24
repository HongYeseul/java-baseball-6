package baseball.model.master;

import static baseball.model.constants.GameRule.START_GAME;

public class GameFlag {
    private boolean flag;
    public GameFlag() {
        flag = START_GAME;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }
}
