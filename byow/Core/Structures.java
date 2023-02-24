package byow.Core;

import byow.TileEngine.TETile;
import byow.TileEngine.Tileset;
import static byow.Core.Helper.*;
import static byow.Core.Point.*;

import java.util.ArrayList;
import java.util.Random;

public class Structures {

    private static final int WIDTH = 60;
    private static final int HEIGHT = 40;

    static void fillInSMOOTHGRASS(TETile[][] currentArray) {
        for (int x = 0; x < WIDTH; x += 1) {
            for (int y = 0; y < HEIGHT; y += 1) {
                currentArray[x][y] = Tileset.SAND;
            }
        }
    }

    public static void fillInWater(TETile[][] currentArray) {
        for (int x = 0; x < WIDTH; x += 1) {
            for (int y = 0; y < HEIGHT; y += 1) {
                currentArray[x][y] = Tileset.WATER;
            }
        }
    }

    public static void createRoom(TETile[][] currentArray, long seed) {
        Random rand = createRandomObj(seed);
        int roomNum = 0;
        while (roomNum <= rand.nextInt(5)+100) {
            int xStart = rand.nextInt(53)+ 2 ;
            int yStart = rand.nextInt(34)+2;
            int xEnd = rand.nextInt(1) + 3;
            int yEnd = rand.nextInt(1) + 3;
            for (int x = xStart; x < xStart + xEnd; x++) {
                for (int y = yStart; y < yStart + yEnd; y++)
                    currentArray[x][y] = Tileset.SAND;
            }
            roomNum += 1;
        }
        //creates spawn area
        for (int x = 0; x < 9; x += 1) {
            for (int y = 20; y < HEIGHT; y += 1) {
                currentArray[x][y] = Tileset.WATER;
            }
        }
        for (int x = 3; x < 9; x += 1) {
            for (int y = 29; y < 36; y += 1) {
                currentArray[x][y] = Tileset.SAND;
            }
        }
        for (int x = 0; x < 9; x += 1) {
            for (int y = 33; y < HEIGHT; y += 1) {
                currentArray[x][y] = Tileset.WATER;
            }
        }
    }
    public static ArrayList createBottomRightCorners(TETile[][] currentArray) {
        ArrayList flowerList = new ArrayList<>();
        for (int x = 0; x < WIDTH; x += 1) {
            for (int y = 0; y < HEIGHT; y += 1) {
                if (currentArray[x][y] == Tileset.SAND && currentArray[x+1][y] == Tileset.WATER
                        && currentArray[x][y-1] == Tileset.WATER) {
                    currentArray[x][y] = Tileset.FLOWER;
                }
                if (currentArray[x][y] == Tileset.FLOWER) {
                    Point flowerPoint = new Point(x, y, currentArray[x][y]);
                    flowerList.add(flowerPoint);
                }
            }
        }
        return flowerList;
    }
    public static void connectRightEdges(TETile[][] currentArray) {
        ArrayList rightCornerList = createBottomRightCorners(currentArray);
        int counter = 0;
        int oneMoreThanCounter = 1;
        Point currPoint = (Point) rightCornerList.get(counter);
        Point nextPoint = (Point) rightCornerList.get(oneMoreThanCounter);
        int currXVal = currPoint.x;
        int currYVal = currPoint.y;
        while (oneMoreThanCounter <= rightCornerList.size()-1) {
            while (currXVal < nextPoint.x) {
                currentArray[currXVal][currYVal] = Tileset.SAND;
                currXVal += 1;
            }
            while (currYVal < nextPoint.y) {
                currentArray[currXVal][currYVal] = Tileset.SAND;
                currYVal += 1;
            }
            while (currXVal > nextPoint.x) {
                currentArray[currXVal][currYVal] = Tileset.SAND;
                currXVal -= 1;
            }
            while (currYVal > nextPoint.y) {
                currentArray[currXVal][currYVal] = Tileset.SAND;
                currYVal -= 1;
            } if (oneMoreThanCounter == rightCornerList.size()-1) {
                break;
            }
            counter += 1;
            oneMoreThanCounter += 1;
            currPoint = (Point) rightCornerList.get(counter);
            nextPoint = (Point) rightCornerList.get(oneMoreThanCounter);
            currXVal = currPoint.x;
            currYVal = currPoint.y;
       }
        for (int x = 0; x < WIDTH; x += 1) {
            for (int y = 0; y < HEIGHT; y += 1) {
                if (currentArray[x][y] == Tileset.FLOWER) {
                    currentArray[x][y] = Tileset.SAND;
                }
            }
        }
    }

    public static void pokecenter(TETile[][] currentArray, long seed) {
        Random rand = new Random(seed);
        int xStart = rand.nextInt(20)+ 30 ;
        int yStart = rand.nextInt(20)+10;
        int xEnd = xStart + 7;
        int yEnd = yStart + 7;
        for (int x = xStart; x <= xEnd; x++) {
            for (int y = yStart; y <= yEnd; y++) {
                currentArray[x][y] = Tileset.SAND;
            }
        }
        currentArray[xStart+1][yStart+1] = Tileset.P11;
        currentArray[xStart+1][yStart+2] = Tileset.P12;
        currentArray[xStart+1][yStart+3] = Tileset.P13;
        currentArray[xStart+1][yStart+4] = Tileset.P14;
        currentArray[xStart+1][yStart+5] = Tileset.P15;
        currentArray[xStart+2][yStart+1] = Tileset.P21;
        currentArray[xStart+2][yStart+2] = Tileset.P22;
        currentArray[xStart+2][yStart+3] = Tileset.P23;
        currentArray[xStart+2][yStart+4] = Tileset.P24;
        currentArray[xStart+2][yStart+5] = Tileset.P25;
        currentArray[xStart+3][yStart+1] = Tileset.P31;
        currentArray[xStart+3][yStart+2] = Tileset.P32;
        currentArray[xStart+3][yStart+3] = Tileset.P33;
        currentArray[xStart+3][yStart+4] = Tileset.P34;
        currentArray[xStart+3][yStart+5] = Tileset.P35;
        currentArray[xStart+4][yStart+1] = Tileset.P41;
        currentArray[xStart+4][yStart+2] = Tileset.P42;
        currentArray[xStart+4][yStart+3] = Tileset.P43;
        currentArray[xStart+4][yStart+4] = Tileset.P44;
        currentArray[xStart+4][yStart+5] = Tileset.P45;
        currentArray[xStart+5][yStart+1] = Tileset.P51;
        currentArray[xStart+5][yStart+2] = Tileset.P52;
        currentArray[xStart+5][yStart+3] = Tileset.P53;
        currentArray[xStart+5][yStart+4] = Tileset.P54;
        currentArray[xStart+5][yStart+5] = Tileset.P55;
    }

    public static void walls(TETile[][] currentArray) {
        for (int x = 1; x < WIDTH-1; x += 1) {
            for (int y = 1; y < HEIGHT-1; y += 1) {
                if (currentArray[x][y] == Tileset.WATER) {
                    if (currentArray[x][y-1] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLUP;
                    }
                    if (currentArray[x][y+1] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLDOWN;
                    }
                    if (currentArray[x-1][y] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLRIGHT;
                    }
                    if (currentArray[x+1][y] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLLEFT;
                    }
                    if (currentArray[x-1][y] == Tileset.SAND && currentArray[x][y-1] == Tileset.SAND && currentArray[x+1][y] != Tileset.SAND && currentArray[x][y+1] != Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLBOTTOMLEFT;
                    }
                    if (currentArray[x-1][y] == Tileset.SAND && currentArray[x][y+1] == Tileset.SAND && currentArray[x+1][y] != Tileset.SAND && currentArray[x][y-1] != Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLTOPLEFT;
                    }
                    if (currentArray[x+1][y] == Tileset.SAND && currentArray[x][y+1] == Tileset.SAND && currentArray[x-1][y] != Tileset.SAND && currentArray[x][y-1] != Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLTOPRIGHT;
                    }
                    if (currentArray[x+1][y] == Tileset.SAND && currentArray[x][y-1] == Tileset.SAND && currentArray[x-1][y] != Tileset.SAND && currentArray[x][y+1] != Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLBOTTOMRIGHT;
                    }
                    if (currentArray[x-1][y] == Tileset.SAND && currentArray[x+1][y] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLLEFTRIGHT;
                    }
                    if (currentArray[x][y-1] == Tileset.SAND && currentArray[x][y+1] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLUPDOWN;
                    }
                    if (currentArray[x+1][y] == Tileset.SAND && currentArray[x-1][y] == Tileset.SAND &&currentArray[x][y+1] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLDOWNSURROUND;
                    }
                    if (currentArray[x+1][y] == Tileset.SAND && currentArray[x-1][y] == Tileset.SAND &&currentArray[x][y-1] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLUPSURROUND;
                    }
                    if (currentArray[x][y-1] == Tileset.SAND && currentArray[x][y+1] == Tileset.SAND && currentArray[x+1][y] != Tileset.SAND && currentArray[x-1][y] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLLEFTSURROUND;
                    }
                    if (currentArray[x][y-1] == Tileset.SAND && currentArray[x][y+1] == Tileset.SAND && currentArray[x-1][y] != Tileset.SAND && currentArray[x+1][y] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLRIGHTSURROUND;
                    }
                    if (currentArray[x][y-1] == Tileset.SAND && currentArray[x][y+1] == Tileset.SAND && currentArray[x-1][y] == Tileset.SAND && currentArray[x+1][y] == Tileset.SAND) {
                        currentArray[x][y] = Tileset.WALLSURROUND;
                    }
                }
            }
        }
    }

    public static void addRandomObjects(TETile[][] currentArray, long seed) {
        Random rand = createRandomObj(seed);
        for (int x = 3; x < WIDTH-3; x += 1) {
            for (int y = 3; y < HEIGHT-3; y += 1) {
                if (rand.nextInt(12) == 3 && currentArray[x][y] == Tileset.SAND) {
                    currentArray[x][y] = Tileset.TALLGRASS;
                }
                if (currentArray[x][y] == Tileset.TALLGRASS) {
                    if (currentArray[x+1][y] == Tileset.SAND && currentArray[x][y-1] == Tileset.SAND
                            && currentArray[x][y-2] == Tileset.SAND) {
                        if (rand.nextInt(2) == 1 || rand.nextInt(2) == 1 || rand.nextInt(2) == 1) {
                            currentArray[x+1][y] = Tileset.TALLGRASS;
                            currentArray[x][y-1] = Tileset.TALLGRASS;
                            currentArray[x][y-2] = Tileset.TALLGRASS;
                        }
                    }
                }
                if (currentArray[x][y] == Tileset.SAND && rand.nextInt(70) == 3) {
                        currentArray[x][y] = Tileset.POKEBALL;
                }
            }
        }
    }
    public static void spawnArea(TETile[][] currentArray) {
        for (int x = 3; x < 9; x += 1) {
            for (int y = 29; y < 33; y += 1) {
                currentArray[x][y] = Tileset.PAVEDROCK;
            }
        }
        currentArray[4][36] = Tileset.BOAT11;
        currentArray[5][36] = Tileset.BOAT21;
        currentArray[6][36] = Tileset.BOAT31;
        currentArray[7][36] = Tileset.BOAT41;
        currentArray[4][37] = Tileset.BOAT12;
        currentArray[5][37] = Tileset.BOAT22;
        currentArray[6][37] = Tileset.BOAT32;
        currentArray[7][37] = Tileset.BOAT42;

        currentArray[5][35] = Tileset.DOCLEFT;
        currentArray[6][35] = Tileset.DOCRIGHT;
        currentArray[5][34] = Tileset.DOCLEFT;
        currentArray[6][34] = Tileset.DOCRIGHT;
        currentArray[5][33] = Tileset.DOCLEFT;
        currentArray[6][33] = Tileset.DOCRIGHT;
    }
}


