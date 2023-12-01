package racingcar.view;

import java.util.List;
import java.util.stream.IntStream;
import racingcar.model.Car;
import racingcar.model.Vehicle;
import racingcar.model.Winners;

public class OutputView implements Output {

    private final String PRINT_CAR_LOCATION_START_MESSAGE = "\n실행 결과";
    private final String PRINT_WINNERS_MESSAGE = "최종 우승자 : ";
    private final String COMMA = ",";
    private final String CAR_LOCATION_MESSAGE = "%s : %s%n";
    private final String CAR_LOCATION = "-";

    @Override
    public void printCarLocationsStartMessage() {
        System.out.println(PRINT_CAR_LOCATION_START_MESSAGE);
    }

    @Override
    public void printWinners(Winners winners) {
        System.out.print(PRINT_WINNERS_MESSAGE + String.join(COMMA, winners.getWinners()));
    }


    @Override
    public void printCarLocations(List<Vehicle> cars) {
        cars.stream().forEach(this::printCarInfo);
        System.out.println();
    }

    private void printCarInfo(Vehicle car) {
        String locationIndicator = CAR_LOCATION.repeat(car.getLocation());
        System.out.printf(CAR_LOCATION_MESSAGE, car.getName(), locationIndicator);
    }


}
