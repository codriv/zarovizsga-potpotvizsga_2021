package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish{

    private final int INCREASE_WEIGHT = 1;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        hasMemoryLoss = true;
    }

    @Override
    public void feed() {
        weight += INCREASE_WEIGHT;
    }
}
