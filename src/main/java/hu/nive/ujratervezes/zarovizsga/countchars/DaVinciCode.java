package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DaVinciCode {

    public int encode(String path, Character character) {
        if (character != '0' && character != '1' && character != 'x') {
            throw new IllegalArgumentException("Wrong character!");
        }
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            return getNumberOfChars(lines, character);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read File!");
        }
    }

    private int getNumberOfChars(List<String> lines, Character character) {
        int numOfChars = 0;
        for (String line: lines) {
            numOfChars += getNumberOfharsPerLine(line.toCharArray(), character);
        }
        return numOfChars;
    }

    private int getNumberOfharsPerLine(char[] line, Character character) {
        int numOfCharsPerLine = 0;
        for (char actual: line) {
            if (character == actual) {
                numOfCharsPerLine++;
            }
        }
        return numOfCharsPerLine;
    }
}
