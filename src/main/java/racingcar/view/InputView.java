package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;

public class InputView implements Input {


    public String readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        return input;
    }

    public String readTryNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        validateReadTryNumber(input);
        return input;
    }

    private void validateReadTryNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 시도 회수는 숫자만 입력할 수 있습니다.");
        }
    }

    private void validateReadCarNamesForm(String input) {
        if (!Pattern.matches("^[\\w]+(,[\\w]+)+$\n", input)) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름이 형식에 맞지 않습니다.");
        }
    }


}
