package baseball.model.computer;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Random {
    public static Answer makeAnswer() {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return new Answer(randomNumbers);
    }
}
