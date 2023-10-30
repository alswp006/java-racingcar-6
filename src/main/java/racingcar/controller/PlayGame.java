package racingcar.controller;

import racingcar.service.CarMove;
import racingcar.service.FindWinner;
import racingcar.service.SettingGame;
import racingcar.view.PrintInput;
import racingcar.view.PrintOutput;
import racingcar.view.PrintResult;

import java.util.HashMap;
import java.util.List;

public class PlayGame {
    public void play() {
        SettingGame setGame = new SettingGame();

        PrintInput.inputCar();
        String[] car_Names = setGame.inputCar();
        HashMap<String, Integer> car_list = setGame.settingcar(car_Names);

        PrintInput.inputNumberOfMove();
        int game = setGame.numberOfGame();

        for (int i = 0; i < game; i++) {
            CarMove.move(car_list);
            PrintOutput.printAllMove(car_list);
        }

        FindWinner win = new FindWinner();
        List<String> winner = win.findWinner(car_list);
        PrintResult.printWinner(winner);
    }
}