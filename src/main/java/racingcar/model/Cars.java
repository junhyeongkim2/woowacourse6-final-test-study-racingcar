package racingcar.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import net.bytebuddy.pool.TypePool.Resolution.Illegal;

public class Cars {

    private static final String COMMA = ",";
    private static final int LOCATION = 0;
    private static final int MAX_NAME_LENGTH = 5;
    private static final String DUPLICATE_NAME_ERROR = "[ERROR] 중복된 이름이 발생했습니다.";
    private static final String OVER_FIVE_LENGTH_NAME_ERROR = "[ERROR] 이름은 5자 이하만 가능합니다.";
    private static final String SPACE_NAME_ERROR = "[ERROR] 이름은 한 글자 이상부터 가능합니다.";
    private static final String SPACE = "";

    private final List<Vehicle> cars;

    private Cars(List<Vehicle> cars) {
        this.cars = cars;
    }

    public static Cars of(String carNames) {
        List<String> names = List.of(carNames.split(COMMA));
        validateDuplicate(names);
        validateIsOverFiveNameLength(names);
        validateNullName(names);
        return new Cars(names.stream().map(name -> new Car(name, LOCATION)).collect(Collectors.toList()));
    }

    public List<Vehicle> moveForwardAll() {
        cars.stream().forEach(car -> car.moveForward(RandomNumberGenerator.generate()));
        return cars;
    }

    public List<Vehicle> getCars() {
        return Collections.unmodifiableList(cars);
    }

    private static void validateDuplicate(List<String> names) {
        if (names.stream().distinct().count() != names.size()) {
            throw new IllegalArgumentException(DUPLICATE_NAME_ERROR);
        }
    }

    private static void validateIsOverFiveNameLength(List<String> names) {
        for (String name : names) {
            if (name.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException(OVER_FIVE_LENGTH_NAME_ERROR);
            }
        }
    }

    private static void validateNullName(List<String> names) {
        for (String name : names) {
            if (name.equals(SPACE)) {
                throw new IllegalArgumentException(SPACE_NAME_ERROR);
            }
        }
    }


}
