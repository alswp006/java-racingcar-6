package racingcar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OutputView {
    public void moveResultMessage() {
        System.out.println("실행 결과");
    }

    public void moveResult(Map<String, Integer> car_move) {
        car_move.forEach((key, value) -> {
            System.out.print(key + " : ");
            IntStream.range(0, value).forEach(i -> System.out.print("-"));
            System.out.println();
        });
        System.out.println();
    }

    public void gameWinner(List<String> winnerList) {
        String result = String.join(", ", winnerList);
        System.out.println("최종 우승자 : " + result);
    }

}
