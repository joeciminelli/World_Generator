package byow.Core;

import byow.TileEngine.TETile;

public class Point {

    public int x;
    public int y;
    public TETile tile;

    public Point(int x, int y, TETile tile){
        this.x = x;
        this.y = y;
        this.tile = tile;
    }
}
