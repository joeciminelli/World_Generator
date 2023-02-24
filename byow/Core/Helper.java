package byow.Core;

import byow.TileEngine.TETile;
import byow.TileEngine.Tileset;

import java.util.ArrayList;
import java.util.Random;

public class Helper {

    private static final int WIDTH = 60;
    private static final int HEIGHT = 40;

    public static long seedStringToLong(String seed) {
        String trimmed = seed.substring(1, seed.length()-1);
        long converted = Long.parseLong(trimmed);
        return converted;
    }

    public static Random createRandomObj(long seed) {
        Random rand = new Random(seed);
        return rand;
    }

    public static TETile[][] createDeepCopy(TETile[][] original) {
        TETile[][] copy = new TETile[60][40];
        for ( int i = 0; i < copy.length; i++ ) {
            copy[i] = new TETile[original[i].length];
            System.arraycopy(original[i], 0, copy[i], 0, original[i].length);
        }
        return copy;
    }

}
