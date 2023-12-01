package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputViewTest {

    @AfterEach
    void setUp() {
        Console.close();
    }

    @DisplayName("시도 회수 입력 시 숫자가 아닌 경우 에러 발생 테스트")
    @Test
    void readCarNames_IsNotValidForm_ExceptionThrow() {
        //given
        ByteArrayInputStream fakeInput = new ByteArrayInputStream("abc".getBytes());
        System.setIn(fakeInput);
        InputView inputView = new InputView();
        //when

        //then
        assertThatThrownBy(() -> inputView.readTryNumber()).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 시도 회수는 숫자만 입력할 수 있습니다.");

    }

}
