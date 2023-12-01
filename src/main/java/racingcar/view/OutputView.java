package racingcar.view;

import java.util.List;
import java.util.stream.IntStream;
import racingcar.model.Car;
import racingcar.model.Vehicle;
import racingcar.model.Winners;

public class OutputView implements Output {

    @Override
    public void printCarLocationsStartMessage() {
        System.out.println("실행 결과");
    }

    @Override
    public void printWinners(Winners winners) {
        System.out.print("최종 우승자 : " + String.join(",", winners.getWinners()));
    }


    @Override
    public void printCarLocations(List<Vehicle> cars) {
        cars.stream().forEach(this::printCarInfo);
        System.out.println();
    }

    private void printCarInfo(Vehicle car) {
        String locationIndicator = "-".repeat(car.getLocation());
        System.out.printf("%s : %s%n", car.getName(), locationIndicator);
    }


}
