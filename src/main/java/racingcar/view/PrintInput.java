package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.ValidCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintInput {
    public static void inputCar() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void inputNumberOfMove(){
        System.out.println("시도할 회수는 몇회인가요?");
    }
}
