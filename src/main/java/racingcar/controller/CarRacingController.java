package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Winners;
import racingcar.service.CarRacingService;
import racingcar.view.Input;
import racingcar.view.InputView;
import racingcar.view.Output;
import racingcar.view.OutputView;

public class CarRacingController {

    private final int START_NUMBER = 0;
    private final Input inputView;
    private final Output outputView;
    private final CarRacingService carRacingService;

    public CarRacingController(InputView inputView, OutputView outputView, CarRacingService carRacingService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.carRacingService = carRacingService;
    }

    public void start() {
        Cars cars = carRacingService.createCars(inputView.readCarNames());
        int tryNumber = Integer.parseInt(inputView.readTryNumber());
        outputView.printCarLocationsStartMessage();
        repeatMoveForwardAll(cars, tryNumber);
        outputView.printWinners(carRacingService.judegWinners(cars));
    }

    private void repeatMoveForwardAll(Cars cars, int tryNumber) {
        for (int i = START_NUMBER; i < tryNumber; i++) {
            outputView.printCarLocations(carRacingService.moveForwardAll(cars));
        }
    }


}
