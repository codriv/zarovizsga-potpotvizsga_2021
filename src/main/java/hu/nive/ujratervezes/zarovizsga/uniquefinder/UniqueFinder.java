package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.*;

public class UniqueFinder {

    public List<Character> uniqueChars(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input is null!");
        }
        Set<Character> charSet = new LinkedHashSet<>();
        for (Character character: string.toCharArray()) {
            charSet.add(character);
        }
        return new ArrayList<>(charSet);
    }
}
