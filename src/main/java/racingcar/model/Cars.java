package racingcar.model;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> moveForwardAll() {
        cars.stream().forEach(car -> car.moveForward(RandomNumberGenerator.generate()));
        return cars;
    }


}
