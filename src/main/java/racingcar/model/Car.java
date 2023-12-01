package racingcar.model;

public class Car implements Vehicle {
    private final int FORWARD_POSSIBLE_NUMBER = 4;
    private final int FORWARD_AMOUNT = 1;
    private final String name;
    private int location;

    public Car(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public int moveForward(int randomNumber) {
        if (randomNumber >= FORWARD_POSSIBLE_NUMBER) {
            return location += FORWARD_AMOUNT;
        }
        return location;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }


}
