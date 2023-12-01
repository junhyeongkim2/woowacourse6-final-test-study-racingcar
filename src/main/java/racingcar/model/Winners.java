package racingcar.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {

    private final List<String> winners;

    public Winners(List<Car> cars) {
        this.winners = judgeWinners(cars);
    }

    public List<String> judgeWinners(List<Car> cars) {
        int maxValue = cars.stream().mapToInt(car -> car.getLocation()).max().orElseThrow();
        return cars.stream().filter(car -> car.getLocation() == maxValue).map(car -> car.getName())
                .collect(Collectors.toList());
    }

    public List<String> getWinners() {
        return Collections.unmodifiableList(winners);
    }


}
