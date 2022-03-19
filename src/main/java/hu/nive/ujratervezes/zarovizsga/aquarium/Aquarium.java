package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aquarium {

    List<Fish> aquarium =  new ArrayList<>();

    public void addFish(Fish fish) {
        aquarium.add(fish);
    }

    public void removeFish() {
        aquarium.removeIf(fish -> 11 <= fish.getWeight());
    }

    public void feed() {
        aquarium.forEach(Fish::feed);
    }

    public List<String> getStatus() {
        return aquarium.stream().map(Fish::status).collect(Collectors.toList());
    }
}
