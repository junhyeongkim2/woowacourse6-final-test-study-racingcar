package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.Input;
import racingcar.view.InputView;
import racingcar.view.Output;
import racingcar.view.OutputView;

public class CarRacingController {
    Input inputView;
    Output outputView;

    public CarRacingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        Cars cars = Cars.of(inputView.readCarNames());
        int tryNumber = Integer.parseInt(inputView.readTryNumber());
        outputView.printCarLocationsStartMessage();
        for (int i = 0; i < tryNumber; i++) {
            outputView.printCarLocations(cars.moveForwardAll());
        }


    }


}
