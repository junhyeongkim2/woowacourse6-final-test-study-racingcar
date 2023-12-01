package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CarTest {

    @DisplayName("자동차 전진 성공 테스트")
    @Test
    void moveForward_EqualForwardLocation_Success() {
        //given
        Vehicle car = new Car("new Car", 0);
        //when
        int location = car.moveForward(5);
        location = car.moveForward(8);
        //then
        assertThat(location).isEqualTo(2);
    }

    @DisplayName("자동차 전진 실패 테스트")
    @Test
    void moveForward_EqualFailLocation_Success() {
        //given
        Vehicle car = new Car("new Car", 0);
        //when
        int location = car.moveForward(3);
        location = car.moveForward(2);
        //then
        assertThat(location).isEqualTo(0);
    }
}
