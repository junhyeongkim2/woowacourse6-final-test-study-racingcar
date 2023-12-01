package racingcar.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import net.bytebuddy.pool.TypePool.Resolution.Illegal;

public class Cars {

    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(String carNames) {
        List<String> names = List.of(carNames.split(","));
        validateDuplicate(names);
        validateIsOverFiveNameLength(names);
        return new Cars(names.stream().map(name -> new Car(name, 0)).collect(Collectors.toList()));
    }

    public List<Car> moveForwardAll() {
        cars.stream().forEach(car -> car.moveForward(RandomNumberGenerator.generate()));
        return cars;
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    private static void validateDuplicate(List<String> names) {
        if (names.stream().distinct().count() != names.size()) {
            throw new IllegalArgumentException("[ERROR] 중복된 이름이 발생했습니다.");
        }
    }

    private static void validateIsOverFiveNameLength(List<String>names){
        for(String name : names){
            if(name.length()>5){
                throw new IllegalArgumentException("[ERROR] 이름은 5자 이하만 가능합니다.");
            }
        }

    }


}
