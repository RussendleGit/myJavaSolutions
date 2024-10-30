import java.util.Arrays;

class YahtzeeGame {
    public static void main(String[] args) {
        DieValues die = new DieValues();
        System.out.println(die);
    }
    public static int getScore(DieValues dieValues) {
        int score = dieValues.sum();


        // Calculate Standard Score and store in a variable
        // Check for each category of bonus points and add to score
        // Be sure that you don't give extra bonus points
        // (three of a kind AND Yahtzee instead of just Yahtzee)
        // return the total number of points.
        return 0;
    }
    
}

public class DieValues {
    private int[] values = new int[5];
    private int[] occurrences = {0, 0, 0, 0, 0};
    boolean isThreeOfAKind = false;
    boolean isFourOfAKind = false;
    boolean isFullHouse = false;
    boolean isSmallStraight = false;
    boolean isLargeStraight = false;
    boolean isYatzee = false;
    
    public DieValues() { // im going to look back at this in disappointmnet lol
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 6) + 1;
            if (values[i] == 1) {
                occurrences[0]++;
            } else if (values[i] == 2) {
                occurrences[1]++;
            } else if (values[i] == 3) {
                occurrences[2]++;
            } else if (values[i] == 4) {
                occurrences[3]++;
            } else {
                occurrences[4]++;
            }
        }

        for (int numbers : occurrences) {
            if (numbers == 5) {
                isYatzee = true;
                break;
            } else if (numbers == 4) {
                isFourOfAKind = true;
                break;
            } else if (numbers == 3) {
                isThreeOfAKind = true;
            }
            if (numbers == 2 && isThreeOfAKind) {
                isFullHouse = true;
                isThreeOfAKind = false;
                break;
            }
        }

        Arrays.sort(values);
        // 1, 2, 3, 4, 5
        // 1, 1, 2, 3, 4
        // 2, 2, 3, 4, 5
        // 3, 3, 4, 5, 1
    }

    public int sum() {
        int collection = 0;
        for (int i = 0; i < values.length; i++) {
            collection += values[i];
        } 
        return collection;
    }

}