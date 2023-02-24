package byow.Core;

import byow.TileEngine.TETile;
import byow.Core.Structures.*;

import static byow.Core.Structures.*;

public class CreateArray {

    private static final int WIDTH = 60;
    private static final int HEIGHT = 40;

    public static TETile[][] generated2DArray(long seed) {
        TETile[][] currentArray = new TETile[WIDTH][HEIGHT];
        fillInWater(currentArray);
        createRoom(currentArray, seed);
        createBottomRightCorners(currentArray);
        connectRightEdges(currentArray);
        pokecenter(currentArray, seed);
        walls(currentArray);
        addRandomObjects(currentArray, seed);
        spawnArea(currentArray);
        return currentArray;
    }

}
