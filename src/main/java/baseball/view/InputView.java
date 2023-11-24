package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String readLine(){
        return Console.readLine();
    }

    public void close(){
        Console.close();
    }

    public String inputNumbers() {
        return readLine();
    }

    public Integer askRestart() {
        return Integer.parseInt(readLine());
    }
}
