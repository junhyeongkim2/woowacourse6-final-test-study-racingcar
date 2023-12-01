package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;

public class InputView implements Input {

    private final String READ_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
    private final String READ_TRY_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?";
    private final String READ_TRY_NUMBER_NOT_INTEGER_ERROR_MESSAGE = "[ERROR] 시도 회수는 숫자만 입력할 수 있습니다.";
    private final String READ_CAR_NAMES_INVALID_FORM_ERROR_MESSAGE = "[ERROR] 자동차 이름이 형식에 맞지 않습니다.";
    private final String READ_CAR_NAMES_REGREX_FORM = "^(?:[a-zA-Z가-힣1-9]+,)*[a-zA-Z가-힣1-9]+$";


    public String readCarNames() {
        System.out.println(READ_CAR_NAMES_MESSAGE);
        String input = Console.readLine();
        validateReadCarNamesForm(input);
        return input;
    }

    public String readTryNumber() {
        System.out.println(READ_TRY_NUMBER_MESSAGE);
        String input = Console.readLine();
        validateReadTryNumber(input);
        return input;
    }

    private void validateReadTryNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(READ_TRY_NUMBER_NOT_INTEGER_ERROR_MESSAGE);
        }
    }

    private void validateReadCarNamesForm(String input) {
        if (!Pattern.matches(READ_CAR_NAMES_REGREX_FORM, input)) {
            throw new IllegalArgumentException(READ_CAR_NAMES_INVALID_FORM_ERROR_MESSAGE);
        }
    }


}
