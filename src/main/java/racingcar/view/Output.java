package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public interface Output {

    void printCarLocations(List<Car> moveForwardAll);

    void printCarLocationsStartMessage();
}
