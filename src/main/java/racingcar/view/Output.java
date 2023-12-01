package racingcar.view;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Winners;

public interface Output {

    void printCarLocations(List<Car> moveForwardAll);

    void printCarLocationsStartMessage();

    void printWinners(Winners winners);
}
