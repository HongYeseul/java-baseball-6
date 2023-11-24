package baseball.controller;

import baseball.view.InputView;
import baseball.view.OutputView;

public class MainController {
    InputView inputView;
    OutputView outputView;

    public MainController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void play() {
    }
}
