package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Car {
    HashMap<String, Integer> cars = new HashMap<>();

    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int MIN_CAR_MOVE_NUMBER = 4;

    public Car(String input) {
        for (String car : List.of(input.split(","))) {
            cars.put(car, 0);
        }
    }

    public Map<String, Integer> carMove() {
        for (String car : cars.keySet()) {
            eachCarMove(car);
        }

        return cars;
    }

    private void eachCarMove(String carName) {
        if (moveCheck()) {
            cars.put(carName, cars.get(carName) + 1);
        }
    }

    private boolean moveCheck() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);

        return randomNumber >= 4;
    }

    public List<String> findWinner() {
        int maxMove = findMaxValue();

        return cars.entrySet().stream()
                .filter(car -> car.getValue().equals(maxMove))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private int findMaxValue() {
        int maxMove = 0;

        for (int move : cars.values()) {
            maxMove = Math.max(maxMove, move);
        }

        return maxMove;
    }
}
