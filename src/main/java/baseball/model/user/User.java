package baseball.model.user;

import java.util.ArrayList;
import java.util.List;

import static baseball.model.constants.GameRule.NUMBER_COUNT;
import static baseball.model.user.Validator.checkUniqueNumbers;

public class User {
    TryNumber tryNumber = new TryNumber();

    public TryNumber getTryNumber() {
        return tryNumber;
    }

    public TryNumber inputGameNumber(String inputNumber) {
        List<Integer> fromInputNumbers = makeNumbersFromString(inputNumber);
        checkUniqueNumbers(fromInputNumbers);
        tryNumber.makeNumber(fromInputNumbers);
        return tryNumber;
    }

    private List<Integer> makeNumbersFromString(String inputNumber) {
        List<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < NUMBER_COUNT; index++) {
            numbers.add(Integer.parseInt(String.valueOf(inputNumber.charAt(index))));
        }
        return numbers;
    }
}
