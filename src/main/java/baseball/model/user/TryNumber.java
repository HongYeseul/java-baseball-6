package baseball.model.user;

import java.util.Collection;
import java.util.List;

public class TryNumber {
    List<Integer> tryNumbers;

    public void makeNumber(List<Integer> numbers) {
        tryNumbers = numbers;
    }

    public List<Integer> getNumbers() {
        return tryNumbers;
    }

    public int getNumberByIndex(int index) {
        return tryNumbers.get(index);
    }
}
