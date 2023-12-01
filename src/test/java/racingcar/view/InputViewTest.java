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
    void readTryNumber_IsNotInteger_ExceptionThrow() {
        //given
        ByteArrayInputStream fakeInput = new ByteArrayInputStream("abc".getBytes());
        System.setIn(fakeInput);
        InputView inputView = new InputView();
        //when

        //then
        assertThatThrownBy(() -> inputView.readTryNumber()).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 시도 회수는 숫자만 입력할 수 있습니다.");

    }

    @DisplayName("자동차 이름 입력 시 형식에 맞지 않는 경우 에러 발생 테스트")
    @Test
    void readCarNames_IsNotValidForm_ExceptionThrow() {
        //given
        ByteArrayInputStream fakeInput = new ByteArrayInputStream("jun,pobi,king,kk12,,^".getBytes());
        System.setIn(fakeInput);
        InputView inputView = new InputView();
        //when

        //then
        assertThatThrownBy(() -> inputView.readCarNames()).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 자동차 이름이 형식에 맞지 않습니다.");

    }



}
