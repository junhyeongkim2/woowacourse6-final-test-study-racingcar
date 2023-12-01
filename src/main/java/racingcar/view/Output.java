package racingcar.view;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Vehicle;
import racingcar.model.Winners;

public interface Output {

    void printCarLocations(List<Vehicle> moveForwardAll);

    void printCarLocationsStartMessage();

    void printWinners(Winners winners);
}
