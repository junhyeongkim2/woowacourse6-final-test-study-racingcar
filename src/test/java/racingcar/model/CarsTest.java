package racingcar.model;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarsTest {

    @DisplayName("모든 자동차 횟수만큼 전진 시도 테스트")
    @Test
    void moveForwardAll_EqualResult_Success() {
        //given
        Cars cars = Cars.of("pobi,king,jun");
        //when
        List<Vehicle> carLocations = cars.moveForwardAll();
        //then
        carLocations.stream().forEach(carLocation -> System.out.println(carLocation.getLocation()));
        assertThat(carLocations.size()).isEqualTo(3);
    }

    @DisplayName("중복된 이름 발생 예외 발생 테스트")
    @Test
    void of_IsDuplicate_ExceptionThrow() {
        //given
        //when
        //then
        assertThatThrownBy(() -> Cars.of("pobi,king,jun,pobi")).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 중복된 이름이 발생했습니다.");
        assertThatThrownBy(() -> Cars.of("pobi,king,jun,king,king")).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 중복된 이름이 발생했습니다.");
        assertThatThrownBy(() -> Cars.of("pobi,king,jun,jun")).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 중복된 이름이 발생했습니다.");

    }

    @DisplayName("자동차 이름 5자리 초과 입력 예외 발생 테스트")
    @Test
    void of_IsOverFiveNameLength_ExceptionThrow() {
        //given
        //when
        //then
        assertThatThrownBy(() -> Cars.of("pobi,king,jun,aaaaaa")).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 이름은 5자 이하만 가능합니다.");
        assertThatThrownBy(() -> Cars.of("pobi,king,fivenames,a")).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 이름은 5자 이하만 가능합니다.");
    }

    @DisplayName("자동차 빈 이름 입력 예외 발생 테스트")
    @Test
    void of_IsUnderOneNameLength_ExceptionThrow() {
        //given
        //when
        //then
        assertThatThrownBy(() -> Cars.of("pobi,king,,jun")).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 이름은 한 글자 이상부터 가능합니다.");
        assertThatThrownBy(() -> Cars.of(",king,jun")).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 이름은 한 글자 이상부터 가능합니다.");
    }

}
