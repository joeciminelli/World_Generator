package byow.Core;

import edu.princeton.cs.introcs.StdDraw;
import static byow.Core.User.*;
import java.awt.*;

public class Menu {

    public static final int WIDTH = 60;
    public static final int HEIGHT = 40;

    public static void createMenu() {
        StdDraw.clear(Color.BLACK);
        StdDraw.setPenColor(Color.WHITE);
        Font fontBig = new Font("Monaco", Font.BOLD, 30);
        StdDraw.setFont(fontBig);
        StdDraw.text(WIDTH / 2, HEIGHT / 2 + 4, "Menu");
        StdDraw.text(WIDTH / 2, HEIGHT / 2, "New Game (N)");
        StdDraw.text(WIDTH / 2, HEIGHT / 2 - 4, "Load Game (L)");
        StdDraw.show();
    }
    public static void menuString(String string) {
        StdDraw.clear(Color.BLACK);
        StdDraw.setPenColor(Color.WHITE);
        Font fontBig = new Font("Monaco", Font.BOLD, 30);
        StdDraw.setFont(fontBig);
        StdDraw.text(WIDTH / 2, HEIGHT / 2 - 6, string);
        StdDraw.show();
    }
    public static String usersChoice() {
        String mostRecent = getMostRecentInput();
        if (mostRecent.equals("N") || mostRecent.equals("n")) {
            return "n" + seedEntry();
        }
        return "eh";
    }
    public static String usersChoiceNoDraw() {
        String mostRecent = getMostRecentInput();
        if (mostRecent.equals("N") || mostRecent.equals("n")) {
            return "n" + seedEntryNoDraw();
        }
        return "eh";
    }
}
