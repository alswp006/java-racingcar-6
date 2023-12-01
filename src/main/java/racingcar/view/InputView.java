package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    Validation validation = new Validation();

    public String input_CarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();

        validation.carNamesValidationCheck(input);

        return input;
    }

    public int input_Move() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();

        validation.carMoveValidationCheck(input);

        return Integer.parseInt(input);
    }
}
