package racingcar.controller;

import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;
import java.util.Map;

public class Controller {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void play() {
        String input = inputView.input_CarName();
        int move = inputView.input_Move();

        Car car = new Car(input);

        for (int i = 0; i < move; i++) {
            Map<String, Integer> cars = car.carMove();
            outputView.moveResult(cars);
        }

        List<String> winnerList = car.findWinner();
        outputView.gameWinner(winnerList);

    }
}
