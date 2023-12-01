package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    private final static int START_NUMBER = 0;
    private final static int END_NUMBER = 9;

    private RandomNumberGenerator() {
    }

    public static int generate() {
        return Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
    }

}
