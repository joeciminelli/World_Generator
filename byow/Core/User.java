package byow.Core;
import byow.TileEngine.TERenderer;
import byow.TileEngine.TETile;
import byow.TileEngine.Tileset;
import edu.princeton.cs.introcs.StdDraw;

import static byow.Core.CreateArray.generated2DArray;
import static byow.Core.Helper.*;
import static byow.Core.Helper.seedStringToLong;
import static byow.Core.Menu.*;

public class User {

    public static final int WIDTH = 60;
    public static final int HEIGHT = 40;

    public static String seedEntry() {
        int counter = 0;
        String string = new String("");
        while (counter < 1) {
            if (StdDraw.hasNextKeyTyped()) {
                string = string + StdDraw.nextKeyTyped();
                menuString(string);
                if (string.contains("s") || string.contains("S")) {
                    counter +=1;
                }
            }
        }
        return string;
    }
    public static String seedEntryNoDraw() {
        int counter = 0;
        String string = new String("");
        while (counter < 1) {
            if (StdDraw.hasNextKeyTyped()) {
                string = string + StdDraw.nextKeyTyped();
                if (string.contains("s") || string.contains("S")) {
                    counter +=1;
                }
            }
        }
        return string;
    }
    public static String getMostRecentInput() {
        int counter = 0;
        String string = new String("");
        while (counter < 1) {
            if (StdDraw.hasNextKeyTyped()) {
                string = string + StdDraw.nextKeyTyped();
                counter += 1;
            }
        }
        return string;
    }

    public static void avatarMover(TETile[][] currentArray) {
        TERenderer ter = new TERenderer();
        TETile[][] currentArrayCopy = createDeepCopy(currentArray);
        currentArray[6][32] = Tileset.AVATAR;
        ter.renderFrame(currentArray);
        boolean playing = true;
        while (playing) {
            String mostRecent = getMostRecentInput();
            if (mostRecent.equals("s")) {
                for (int x = 0; x < WIDTH; x += 1) {
                    for (int y = 0; y < HEIGHT; y += 1) {
                        if (currentArray[x][y] == Tileset.AVATAR) {
                            currentArray[x][y-1] = Tileset.AVATAR;
                            currentArray[x][y] = currentArrayCopy[x][y];
                            ter.renderFrame(currentArray);
                        }
                    }
                }
            }
            if (mostRecent.equals("d")) {
                for (int x = 0; x < WIDTH; x += 1) {
                    for (int y = 0; y < HEIGHT; y += 1) {
                        if (currentArray[x][y] == Tileset.AVATAR) {
                            currentArray[x+1][y] = Tileset.AVATAR;
                            currentArray[x][y] = currentArrayCopy[x][y];
                            ter.renderFrame(currentArray);
                            mostRecent = null;
                        }
                    }
                }
            }
            if (mostRecent.equals("w")) {
                for (int x = 0; x < WIDTH; x += 1) {
                    for (int y = 0; y < HEIGHT; y += 1) {
                        if (currentArray[x][y] == Tileset.AVATAR) {
                            currentArray[x][y+1] = Tileset.AVATAR;
                            currentArray[x][y] = currentArrayCopy[x][y];
                            ter.renderFrame(currentArray);
                        }
                    }
                }
            }
            if (mostRecent.equals("a")) {
                for (int x = 0; x < WIDTH; x += 1) {
                    for (int y = 0; y < HEIGHT; y += 1) {
                        if (currentArray[x][y] == Tileset.AVATAR) {
                            currentArray[x-1][y] = Tileset.AVATAR;
                            currentArray[x][y] = currentArrayCopy[x][y];
                            ter.renderFrame(currentArray);
                        }
                    }
                }
            }
        }
    }
}
