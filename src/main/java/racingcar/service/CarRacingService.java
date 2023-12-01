package racingcar.service;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Vehicle;
import racingcar.model.Winners;

public class CarRacingService {

    public Cars createCars(String carNames) {
        return Cars.of(carNames);
    }

    public List<Car> moveForwardAll(Cars cars) {
        return cars.moveForwardAll();
    }

    public Winners judegWinners(Cars cars) {
        return new Winners(cars.getCars());
    }
}
