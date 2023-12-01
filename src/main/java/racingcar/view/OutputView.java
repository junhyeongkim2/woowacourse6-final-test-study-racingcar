package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView implements Output {

    @Override
    public void printCarLocationsStartMessage() {
        System.out.println("실행 결과");
    }

    @Override
    public void printCarLocations(List<Car> moveForwardAll) {
    }


}
