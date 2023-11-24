package baseball.view;

import java.util.regex.Pattern;

import static baseball.view.constants.ErrorMessage.INVALID_RESTART_ERROR_MESSAGE;
import static baseball.view.constants.ErrorMessage.INVALID_USER_NUMBERS_ERROR_MESSAGE;
import static baseball.view.constants.Regex.REGEX_NUMERIC_OF_RESTART;
import static baseball.view.constants.Regex.REGEX_NUMERIC_OF_USER_NUMBERS;

public class Validator {
    private static final Pattern RESTART_NUMERIC = Pattern.compile(REGEX_NUMERIC_OF_RESTART);
    private static final Pattern USER_NUMBERS_NUMERIC = Pattern.compile(REGEX_NUMERIC_OF_USER_NUMBERS);

    public static void checkNumericOfUserNumber(String input) {
        if (USER_NUMBERS_NUMERIC.matcher(input).matches()) {
            return;
        }
        throw new IllegalArgumentException(INVALID_USER_NUMBERS_ERROR_MESSAGE);
    }

    public static void checkNumericOfRestart(String input) {
        if (RESTART_NUMERIC.matcher(input).matches()) {
            return;
        }
        throw new IllegalArgumentException(INVALID_RESTART_ERROR_MESSAGE);
    }

}
