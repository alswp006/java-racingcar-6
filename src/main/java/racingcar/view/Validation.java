package racingcar.view;

import java.util.*;


public class Validation {
    private static final int CAR_NAME_LENGTH_LIMIT = 5;
    private static final int MIN_MOVE_NUMBER = 1;

    public void carNamesValidationCheck(String input) {
        carName_EmptyCheck(input);
        carName_SpaceCheck(input);

        List<String> carNames = List.of(input.split(","));
        carName_DuplicationCheck(carNames);
        carName_SizeCheck(carNames);
    }

    public void carMoveValidationCheck(String input) {
        carMove_TypeCheck(input);
        carMove_PositiveCheck(input);
    }

    private void carName_DuplicationCheck(List<String> carNames) {
        Set<String> dupl_carName = new HashSet<>(carNames);

        if (carNames.size() != dupl_carName.size()) {
            throwExecption();
        }
    }

    private void carName_SizeCheck(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() > CAR_NAME_LENGTH_LIMIT) {
                throwExecption();
            }
        }
    }

    private void carName_EmptyCheck(String input) {
        int countComma = input.length() - input.replace(",", "").length();
        int countCars = input.split(",").length;

        if (countComma + 1 != countCars) {
            throwExecption();
        }
    }

    private void carName_SpaceCheck(String input) {
        Arrays.stream(input.split(","))
                .filter(carName -> !carName.equals(carName.trim()))
                .forEach(carName -> throwExecption());
    }

    private void carMove_TypeCheck(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throwExecption();
        }
    }

    private void carMove_PositiveCheck(String input) {
        int move = Integer.parseInt(input);

        if (move < MIN_MOVE_NUMBER) {
            throwExecption();
        }
    }

    private void throwExecption() {
        throw new IllegalArgumentException();
    }
}
