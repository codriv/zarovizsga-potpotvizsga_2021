package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish{

    private final int INCREASE_WEIGHT = 2;

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void feed() {
        weight += INCREASE_WEIGHT;
    }
}
