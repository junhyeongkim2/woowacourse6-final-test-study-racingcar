package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(String carNames) {
        List<String> names = List.of(carNames.split(","));
        return new Cars(names.stream().map(name -> new Car(name, 0)).collect(Collectors.toList()));
    }

    public List<Car> moveForwardAll() {
        cars.stream().forEach(car -> car.moveForward(RandomNumberGenerator.generate()));
        return cars;
    }


}
