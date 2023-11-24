package baseball.model.master;

import baseball.model.computer.Answer;
import baseball.model.computer.Random;
import baseball.model.user.TryNumber;
import baseball.model.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MasterTest {

    @DisplayName("[SUCCESS] 정답과 유저의 값을 비교하여 결과 값을 반환한다.")
    @ParameterizedTest(name = "유저가 입력한 값: {0}, 반환 값(결과값): {1}")
    @CsvSource({"123, 3스트라이크",
            "134, 1스트라이크1볼",
            "987, 낫싱",
            "523, 2스트라이크",
            "839, 1볼"
    })
    void makeResult(String userInput, String output){
        Answer answer = new Answer(Arrays.asList(1,2,3));
        User user = new User();
        Master master = new Master();
        String result = master.makeResult(answer, user.inputGameNumber(userInput));
        assertThat(result).isEqualTo(output);
    }

    @DisplayName("[SUCCESS] 게임을 종료할 것인지 판단한다.")
    @ParameterizedTest(name = "유저가 입력한 값: {0}, 반환 값(결과값): {1}")
    @CsvSource({"1, true", "2, false"})
    void isGameRestart(int flag, boolean result) {
        Master master = new Master();
        assertThat(master.isGameRestart(flag)).isEqualTo(result);
    }
}