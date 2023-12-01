package racingcar;

import racingcar.controller.CarRacingController;
import racingcar.service.CarRacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {

        CarRacingController carRacingController = new CarRacingController(new InputView(), new OutputView(), new CarRacingService());
        carRacingController.start();

    }
}
