package byow.TileEngine;

import java.awt.Color;
import java.io.File;

/**
 * Contains constant tile objects, to avoid having to remake the same tiles in different parts of
 * the code.
 *
 * You are free to (and encouraged to) create and add your own tiles to this file. This file will
 * be turned in with the rest of your code.
 *
 * Ex:
 *      world[x][y] = Tileset.FLOOR;
 *
 * The style checker may crash when you try to style check this file due to use of unicode
 * characters. This is OK.
 */

public class Tileset {
    public static final TETile AVATAR = new TETile('@', Color.white, Color.black, "you");
    public static final TETile WALLLEFT = new TETile('L', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERLEFTSANDRIGHT.png");
    public static final TETile WALLUPDOWN = new TETile('I', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERUPDOWN.png");
    public static final TETile SHELL = new TETile('4', new Color(216, 128, 128), Color.darkGray, "shell", "/Users/joeci1/Desktop/BYOW tiles/SHELLSAND.png");
    public static final TETile WALLSURROUND = new TETile('3', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERSURROUND.png");
    public static final TETile WALLUPSURROUND = new TETile('-', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERUP.png");
    public static final TETile WALLRIGHTSURROUND = new TETile('2', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERRIGHT.png");
    public static final TETile WALLLEFTSURROUND = new TETile('1', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERLEFT.png");
    public static final TETile WALLDOWNSURROUND = new TETile('O', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERDOWN.png");
    public static final TETile WALLLEFTRIGHT = new TETile('Z', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERRIGHTLEFT.png");
    public static final TETile WALLUP = new TETile('U', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERUPSANDDOWN.png");
    public static final TETile WALLDOWN = new TETile('D', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERDOWNSANDUP.png");
    public static final TETile WALLRIGHT = new TETile('#', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERRIGHTSANDLEFT.png");
    public static final TETile WALLBOTTOMRIGHT = new TETile('*', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERBOTTOMRIGHT.png");
    public static final TETile WALLTOPRIGHT = new TETile('<', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERTOPRIGHT.png");
    public static final TETile WALLTOPLEFT = new TETile('T', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERTOPLEFT.png");
    public static final TETile WALLBOTTOMLEFT = new TETile('B', new Color(216, 128, 128), Color.darkGray, "wall", "/Users/joeci1/Desktop/BYOW tiles/WATERBOTTOMLEFT.png");
    public static final TETile FLOOR = new TETile('·', new Color(128, 192, 128), Color.black,
            "floor");
    public static final TETile NOTHING = new TETile(' ', Color.black, Color.black, "nothing");
    public static final TETile TALLGRASS = new TETile('"', Color.green, Color.black, "grass", "/Users/joeci1/Desktop/BYOW tiles/TALLGRASSSAND.png");
    public static final TETile WATER = new TETile('≈', Color.blue, Color.black, "water", "/Users/joeci1/Desktop/BYOW tiles/WATERTILE.png");
    public static final TETile FLOWER = new TETile('❀', Color.magenta, Color.pink, "flower");
    public static final TETile LOCKED_DOOR = new TETile('█', Color.orange, Color.black,
            "locked door");
    public static final TETile UNLOCKED_DOOR = new TETile('▢', Color.orange, Color.black,
            "unlocked door");
    public static final TETile SAND = new TETile('s', Color.green, Color.black, "sand", "/Users/joeci1/Desktop/BYOW tiles/SAND.png");
    public static final TETile MOUNTAIN = new TETile('▲', Color.gray, Color.black, "mountain");
    public static final TETile TREE = new TETile('♠', Color.green, Color.black, "tree");
    public static final TETile SMOOTHGRASS = new TETile('a', Color.green, Color.black, "short grass", "/Users/joeci1/Desktop/BYOW tiles/SMOOTHGRASS.png");

    public static final TETile P11 = new TETile('c', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (1,1).png");
    public static final TETile P12 = new TETile('d', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (1,2).png");
    public static final TETile P13 = new TETile('e', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (1,3).png");
    public static final TETile P14 = new TETile('f', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (1,4).png");
    public static final TETile P15 = new TETile('g', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (1,5).png");
    public static final TETile P21 = new TETile('h', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (2,1).png");
    public static final TETile P22 = new TETile('i', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (2,2).png");
    public static final TETile P23 = new TETile('j', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (2,3).png");
    public static final TETile P24 = new TETile('k', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (2,4).png");
    public static final TETile P25 = new TETile('l', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (2,5).png");
    public static final TETile P31 = new TETile('m', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (3,1).png");
    public static final TETile P32 = new TETile('n', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (3,2).png");
    public static final TETile P33 = new TETile('o', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (3,3).png");
    public static final TETile P34 = new TETile('p', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (3,4).png");
    public static final TETile P35 = new TETile('q', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (3,5).png");
    public static final TETile P41 = new TETile('r', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (4,1).png");
    public static final TETile P42 = new TETile('s', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (4,2).png");
    public static final TETile P43 = new TETile('t', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (4,3).png");
    public static final TETile P44 = new TETile('u', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (4,4).png");
    public static final TETile P45 = new TETile('v', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (4,5).png");
    public static final TETile P51 = new TETile('w', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (5,1).png");
    public static final TETile P52 = new TETile('x', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (5,2).png");
    public static final TETile P53 = new TETile('y', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (5,3).png");
    public static final TETile P54 = new TETile('z', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (5,4).png");
    public static final TETile P55 = new TETile('[', Color.green, Color.black, "Pokecenter", "/Users/joeci1/Desktop/BYOW tiles/POKECENTER (5,5).png");

    public static final TETile POKEBALL = new TETile('8', Color.green, Color.black, "Pokeball", "/Users/joeci1/Desktop/BYOW tiles/POKEBALL.png");

    public static final TETile BOAT11 = new TETile('A', Color.green, Color.black, "Boat", "/Users/joeci1/Desktop/BYOW tiles/CALBOAT (1,1).png");
    public static final TETile BOAT12 = new TETile('A', Color.green, Color.black, "Boat", "/Users/joeci1/Desktop/BYOW tiles/CALBOAT (1,2).png");
    public static final TETile BOAT21 = new TETile('A', Color.green, Color.black, "Boat", "/Users/joeci1/Desktop/BYOW tiles/CALBOAT (2,1).png");
    public static final TETile BOAT22 = new TETile('A', Color.green, Color.black, "Boat", "/Users/joeci1/Desktop/BYOW tiles/CALBOAT (2,2).png");
    public static final TETile BOAT31 = new TETile('A', Color.green, Color.black, "Boat", "/Users/joeci1/Desktop/BYOW tiles/CALBOAT (3,1).png");
    public static final TETile BOAT32 = new TETile('A', Color.green, Color.black, "Boat", "/Users/joeci1/Desktop/BYOW tiles/CALBOAT (3,2).png");
    public static final TETile BOAT41 = new TETile('A', Color.green, Color.black, "Boat", "/Users/joeci1/Desktop/BYOW tiles/CALBOAT (4,1).png");
    public static final TETile BOAT42 = new TETile('A', Color.green, Color.black, "Boat", "/Users/joeci1/Desktop/BYOW tiles/CALBOAT (4,2).png");

    public static final TETile DOCLEFT = new TETile('B', Color.green, Color.black, "Dock", "/Users/joeci1/Desktop/BYOW tiles/DOCLEFT.png");
    public static final TETile DOCRIGHT = new TETile('B', Color.green, Color.black, "Dock", "/Users/joeci1/Desktop/BYOW tiles/DOCRIGHT.png");
    public static final TETile PAVEDROCK = new TETile('B', Color.green, Color.black, "Paved Road", "/Users/joeci1/Desktop/BYOW tiles/PAVED.png");
}



