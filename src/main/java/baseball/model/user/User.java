package baseball.model.user;

import java.util.ArrayList;
import java.util.List;

import static baseball.model.user.Validator.checkUniqueNumbers;

public class User {
    TryNumber tryNumber;

    public void inputGameNumber(String inputNumber) {
        checkUniqueNumbers(makeNumbersFromString(inputNumber));
    }

    private List<Integer> makeNumbersFromString(String inputNumber) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.parseInt(String.valueOf(inputNumber.charAt(0))));
        numbers.add(Integer.parseInt(String.valueOf(inputNumber.charAt(1))));
        numbers.add(Integer.parseInt(String.valueOf(inputNumber.charAt(2))));
        return numbers;
    }
}
