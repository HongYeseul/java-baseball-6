package baseball.model.computer;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.model.constants.GameRule.MAXIMUM_NUMBER_RANGE;
import static baseball.model.constants.GameRule.MINIMUM_NUMBER_RANGE;
import static baseball.model.constants.GameRule.NUMBER_COUNT;

public class Random {
    public static Answer makeAnswer() {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < NUMBER_COUNT) {
            int randomNumber = Randoms.pickNumberInRange(MINIMUM_NUMBER_RANGE, MAXIMUM_NUMBER_RANGE);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return new Answer(randomNumbers);
    }
}
