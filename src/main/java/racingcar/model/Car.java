package racingcar.model;

public class Car implements Vehicle {
    private final String name;
    private int location;

    public Car(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public int moveForward(int randomNumber) {
        if (randomNumber >= 4) {
            return location += 1;
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
