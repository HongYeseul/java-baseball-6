package baseball.model.user;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {
    public static void checkUniqueNumbers(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);

        if (numberSet.size() == numbers.size()) {
            return;
        }
        throw new IllegalArgumentException("서로 다른 수를 입력해야 합니다.");
    }
}
