package baseball.view;

import static baseball.view.constants.OutputMessage.ASK_USER_NUMBERS_MESSAGE;
import static baseball.view.constants.OutputMessage.END_GAME_AND_ASK_RESTART_MESSAGE;
import static baseball.view.constants.OutputMessage.START_MESSAGE;

public class OutputView {
    public void startGame() {
        println(START_MESSAGE);
    }

    public void askNumbers() {
        print(ASK_USER_NUMBERS_MESSAGE);
    }

    public void printResult(String result) {
        println(result);
    }

    private void print(String message) {
        System.out.print(message);
    }

    private void println(String message) {
        System.out.println(message);
    }

    public void endGameAndAskRestart() {
        println(END_GAME_AND_ASK_RESTART_MESSAGE);
    }
}
