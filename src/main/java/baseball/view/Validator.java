package baseball.view;

import java.util.regex.Pattern;

import static baseball.view.constants.ErrorMessage.INVALID_RESTART_ERROR_MESSAGE;
import static baseball.view.constants.Regex.REGEX_NUMERIC_OF_RESTART;

public class Validator {
    private static final Pattern NUMERIC = Pattern.compile(REGEX_NUMERIC_OF_RESTART);

    public static void checkNumericOfRestart(String input) {
        if (NUMERIC.matcher(input).matches()) {
            return;
        }
        throw new IllegalArgumentException(INVALID_RESTART_ERROR_MESSAGE);
    }
}
