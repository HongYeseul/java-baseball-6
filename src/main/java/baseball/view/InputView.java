package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import static baseball.view.Validator.checkNumericOfRestart;

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
        String aboutRestart = readLine();
        checkNumericOfRestart(aboutRestart);
        return Integer.parseInt(aboutRestart);
    }
}
