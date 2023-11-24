package baseball.controller;

import baseball.model.computer.Computer;
import baseball.model.master.GameFlag;
import baseball.model.master.Master;
import baseball.model.user.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class MainController {
    InputView inputView;
    OutputView outputView;
    GameFlag gameFlag;
    User user;
    Master master;

    public MainController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        gameFlag = new GameFlag();
        user = new User();
        master = new Master();
    }

    public void play() {
        outputView.startGame();

        while (gameFlag.getFlag()) {
            Computer computer = new Computer();
            master.gameSetting();
            while (master.isGameEnd()) {
                outputView.askNumbers();
                user.inputGameNumber(inputView.inputNumbers());
                outputView.printResult(master.makeResult(computer.getAnswer(), user.getTryNumber()));
            }
            outputView.endGameAndAskRestart();
            gameFlag.setFlag(master.isGameRestart(inputView.askRestart()));
        }

        inputView.close();
    }
}
