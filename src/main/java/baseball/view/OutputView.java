package baseball.view;

public class OutputView {
    public void startGame() {
        println("숫자 야구 게임을 시작합니다.");
    }

    public void askNumbers() {
        print("숫자를 입력해주세요 : ");
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

    private void nextLine(){
        System.out.print(System.lineSeparator());
    }

    public void endGameAndAskRestart() {
        println("""
                3개의 숫자를 모두 맞히셨습니다! 게임 종료
                게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.""");
    }
}
