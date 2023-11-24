package baseball.model.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


class UserTest {
    @DisplayName("[SUCCESS] 게임 중: 중복된 값을 입력하면 예외가 발생한다.")
    @ParameterizedTest(name = "사용자가 입력하는 값: {0}")
    @CsvSource({"999", "933", "113"})
    void normalInput(String input){
        User user = new User();
        assertThatThrownBy(() -> user.inputGameNumber(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

}