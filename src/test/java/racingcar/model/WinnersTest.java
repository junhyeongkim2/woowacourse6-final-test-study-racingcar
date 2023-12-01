package racingcar.model;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class WinnersTest {

    @DisplayName("우승자 june 계산 테스트")
    @Test
    void calculateWinners_EqualJunWinners_Success() {
        //given
        Winners winners;
        //when
        winners = new Winners(List.of(new Car("pobi", 5), new Car("woni", 2), new Car("jun", 6)));
        List<String> finalWinners = winners.getWinners();
        //then
        assertThat(finalWinners.size()).isEqualTo(1);
        assertThat(finalWinners.get(0)).isEqualTo("jun");
    }


    @DisplayName("우승자 pobi 계산 테스트")
    @Test
    void calculateWinners_EqualPobiWinners_Success() {
        //given
        Winners winners;
        //when
        winners = new Winners(List.of(new Car("pobi", 8), new Car("woni", 2), new Car("jun", 6)));
        List<String> finalWinners = winners.getWinners();
        //then
        assertThat(finalWinners.size()).isEqualTo(1);
        assertThat(finalWinners.get(0)).isEqualTo("pobi");
    }


}
