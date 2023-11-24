package baseball.model.user;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.model.constants.ErrorMessage.USER_NUMBER_MUST_UNIQUE;

public class Validator {
    public static void checkUniqueNumbers(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);

        if (numberSet.size() == numbers.size()) {
            return;
        }
        throw new IllegalArgumentException(USER_NUMBER_MUST_UNIQUE);
    }
}
