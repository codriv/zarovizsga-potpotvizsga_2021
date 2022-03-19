package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    protected String name;
    protected int weight;
    protected String color;
    protected boolean hasMemoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return hasMemoryLoss;
    }

    public String status() {
        return String.format("%s, weight: %d, color: %s, short term memory loss: %s", name, weight, color, hasMemoryLoss);
    }

    public abstract void feed();

}
