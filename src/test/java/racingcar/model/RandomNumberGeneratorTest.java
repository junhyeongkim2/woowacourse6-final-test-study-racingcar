package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class RandomNumberGeneratorTest {

    @DisplayName("랜덤 번호 생성 테스트")
    @Test
    void generateRandomNumber_EqualResult_Success() {
        //given
        int randomNumber;
        //when
        randomNumber = RandomNumberGenerator.generate();
        //then
        assertThat(randomNumber).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(9);
    }


}
