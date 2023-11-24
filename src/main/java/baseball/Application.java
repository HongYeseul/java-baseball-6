package baseball;

import baseball.controller.MainController;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        MainController mainController = new MainController(
                new InputView(),
                new OutputView()
        );

        mainController.play();
    }
}
