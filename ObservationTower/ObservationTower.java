import java.util.Scanner;


// Russell Jarvis
// 12/10/2024
// AP CS A
//
// Elitches Tower Assignment
//
// This program will draw an observation tower that scales with the users input,
// that is done in the most optimal way possible!


public class ObservationTower {


    private final int SIZE;

    public static void main(String[] args) {
        System.out.println("this is the main method");
        new ObservationTower();
    }

    /**
     * Asks for the size you want for the tower
     * then calls drawTower to draw the tower to the screen.
     */
    public ObservationTower() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your towers size:");
        this.SIZE = Math.abs(input.nextInt());
        input.close();
        drawTower();
    }

    /**
     * Displays the ASCII Observation Tower*
     */
    public void drawTower() {
        StringBuilder towerASCII = new StringBuilder();

        towerASCII.append(drawAntenna());
        towerASCII.append(drawBallTop());
        towerASCII.append(drawBallBottom());
        towerASCII.append(drawAntenna());
        towerASCII.append(drawPoll());
        towerASCII.append(drawBallTop());

        System.out.println(towerASCII);
    }

    /**
     * Mirrors ASCII art to reduce redundancy.
     * Also replaces things like '/' or '\', with their counterparts.
     * @param string - Anny ascii art to your hearts content
     * @return string - users input, reversed, with a new line at the end of it.
     */
    private StringBuilder flip(StringBuilder string) {
        StringBuilder newString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i --) {
            if (string.charAt(i) == '/') {
                newString.append("\\");
            } else if (string.charAt(i) == '\\') {
                newString.append("/");
            } else {
                newString.append(string.charAt(i));
            }
        }
        newString.append("\n");
        return newString;
    }

    /**
     * Draws a thicker poll for looks for the tower
     * @return a '|' with '%' of SIZE - 2 and a '|' mirrored. SIZE * 4 times in height
     */
    private StringBuilder drawPoll() {
        StringBuilder towerASCII = new StringBuilder();
        StringBuilder temp;

        for (int i = 0; i < SIZE * 4; i++) {
            temp = new StringBuilder();
            temp.append((SIZE - 1 > 0) ?
                    " ".repeat((SIZE * 2) + 1) :
                    " ".repeat((SIZE * 2)));
            temp.append("|");
            temp.append((SIZE - 1 > 0) ?
                    "%".repeat(SIZE - 2) :
                    "");
            temp.append("|");
            temp.append(flip(temp));
            towerASCII.append(temp);
        }

        return  towerASCII;
    }

    /**
     * draws the bottom of the ball the tower depending on SIZE
     * @return bottom of clock tower to a string
     */
    private StringBuilder drawBallBottom() {
        StringBuilder towerASCII = new StringBuilder();
        StringBuilder temp;

        int x = SIZE - 1;
        for (int y = 0; y < SIZE; y++) {
            temp = new StringBuilder();
            temp.append(" ".repeat(y * 2)); // 2 is length of the slope;
            temp.append("\\_");
            for (int i = 0; i < (x * 2) + SIZE + 1; i++) {
                if (i % 2 == 0) {
                    temp.append("/");
                } else {
                    temp.append("\\");
                }
            }
            temp.append(flip(temp));
            towerASCII.append(temp);
            x--;
        }
        return  towerASCII;
    }

    /**
     * Draws the top and the base of the tower
     * @return the top or the base of the tower depending on SIZE
     */
    private StringBuilder drawBallTop() {
        StringBuilder towerASCII = new StringBuilder();
        StringBuilder temp;
        int x = SIZE - 1;
        for (int y = 0; y < SIZE; y++) {
            temp = new StringBuilder();
            temp.append(" ".repeat(x * 3)); // 3 is slope length
            temp.append("__/");
            temp.append(":".repeat(y * 3));
            temp.append("|");
            temp.append(flip(temp));
            towerASCII.append(temp);
            x--;
        }
        // draws the bottom top of ball
        temp = new StringBuilder();
        temp.append("|");
        temp.append("\"".repeat(SIZE * 3));
        temp.append(flip(temp));
        towerASCII.append(temp);

        return towerASCII;
    }

    /**
     * Draws a line for the middle of the tower, that is the height of SIZE
     * @return '||' centered in the middle, repeated SIZE times
     */
    private StringBuilder drawAntenna() {
        StringBuilder towerASCII = new StringBuilder();
        StringBuilder temp;
        for (int i = 0; i < SIZE; i++) {
            temp = new StringBuilder();
            temp.append(" ".repeat(((SIZE) * 3)));
            temp.append("|");
            temp.append(flip(temp));
            towerASCII.append(temp);
        }
        return towerASCII;
    }
}
