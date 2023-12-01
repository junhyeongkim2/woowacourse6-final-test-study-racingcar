package racingcar.view;

import java.util.List;
import java.util.stream.IntStream;
import racingcar.model.Car;

public class OutputView implements Output {

    @Override
    public void printCarLocationsStartMessage() {
        System.out.println("실행 결과");
    }

    @Override
    public void printCarLocations(List<Car> cars) {
        cars.stream().forEach(this::printCarInfo);
        System.out.println();
    }

    private void printCarInfo(Car car) {
        String locationIndicator = "-".repeat(car.getLocation());
        System.out.printf("%s : %s%n", car.getName(), locationIndicator);
    }
}
