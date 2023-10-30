package racingcar.controller;

import racingcar.service.CarMove;
import racingcar.service.FindWinner;
import racingcar.service.SettingCar;
import racingcar.service.SettingGame;
import racingcar.view.PrintInput;
import racingcar.view.PrintOutput;
import racingcar.view.PrintResult;

import java.util.HashMap;
import java.util.List;

public class PlayGame {
    public void play() {
        PrintInput.inputCar();
        HashMap<String, Integer> car_list = SettingCar.settingcar();

        PrintInput.inputNumberOfMove();
        int game = SettingGame.numberOfGame();

        for (int i = 0; i < game; i++) {
            CarMove.move(car_list);
            PrintOutput.printAllMove(car_list);
        }

        FindWinner win = new FindWinner();
        List<String> winner = win.findWinner(car_list);
        PrintResult.printWinner(winner);
    }
}
