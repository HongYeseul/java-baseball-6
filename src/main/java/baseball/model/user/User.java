package baseball.model.user;

import java.util.ArrayList;
import java.util.List;

import static baseball.model.user.Validator.checkUniqueNumbers;

public class User {
    TryNumber tryNumber = new TryNumber();

    public TryNumber inputGameNumber(String inputNumber) {
        List<Integer> fromInputNumbers = makeNumbersFromString(inputNumber);
        checkUniqueNumbers(fromInputNumbers);
        tryNumber.makeNumber(fromInputNumbers);
        return tryNumber;
    }

    private List<Integer> makeNumbersFromString(String inputNumber) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.parseInt(String.valueOf(inputNumber.charAt(0))));
        numbers.add(Integer.parseInt(String.valueOf(inputNumber.charAt(1))));
        numbers.add(Integer.parseInt(String.valueOf(inputNumber.charAt(2))));
        return numbers;
    }
}
