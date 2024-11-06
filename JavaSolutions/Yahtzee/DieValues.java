import java.util.Arrays;

public class DieValues {
    private int[] values;
    private int[] occurrences = new int[6];
    public int score;
    private boolean[] bonusScores = {false, // is 3 of a kind
         false, // is four of a kind
         false, // is full house
         false, // is small straight
         false, // is large straight
         false // is yattzee
        };
    
    public DieValues() {
        values = new int[5];
        for (int i = 0; i < values.length ; i++) {
            values[i] = (int) (Math.random() * 6) + 1;
        }
    }
    public DieValues(int[] vals) {
        values = vals;
    }
    
    public void FindBonusScores() { // im going to look back at this in disappointmnet lol
        for (int i = 0; i < values.length ; i++) {
            switch (values[i]) {
                case 1 -> occurrences[0]++;
                case 2 -> occurrences[1]++;
                case 3 -> occurrences[2]++;
                case 4 -> occurrences[3]++;
                case 5 -> occurrences[4]++;
                case 6 -> occurrences[5]++;
                default -> throw new AssertionError();
            }
            
        }
        for (int numbers : occurrences) {
            switch (numbers) {
                case 5:
                    bonusScores[5] = true;
                    break;
                case 4:
                    bonusScores[1] = true;
                    break;
                case 3:
                    for (int findingFullHouse : occurrences) {
                        if (findingFullHouse == 2) {
                            bonusScores[0] = false;
                            bonusScores[2] = true;
                        } else {
                            bonusScores[0] = true;
                        }
                    }
                    break;
            }
        }
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            if (i + 3 < values.length             &&
                values[i] + 1 == values[i + 1]     &&
                values[i + 1] + 1 == values[i + 2] &&
                values[i + 2] + 1 == values[i + 3]) {
                    if (i + 4 < values.length &&
                        values[i + 3] + 1 == values[i + 4]) {
                            bonusScores[4] = true;
                        } else {
                            bonusScores[3] = true;
                        }

                }
        }
    }

    public int sum() {
        int collection = 0;
        for (int i = 0; i < values.length; i++) {
            collection += values[i];
        } 
        return collection;
    }

    public int GetYatzeeScore() {
        this.FindBonusScores();
        score = this.sum();
        if (bonusScores[0] || bonusScores[1]) {
            score *= 2;
        } 
        if (bonusScores[2]) {
            score += 25;
        }
        if (bonusScores[3]) {
            score += 30;
        }
        if (bonusScores[4]) {
            score += 40;
        }
        if (bonusScores[5]) {
            score += 50;
        }
        return score;
    }

}