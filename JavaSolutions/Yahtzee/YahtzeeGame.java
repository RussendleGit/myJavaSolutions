
class YahtzeeGame {
    public static void main(String[] args) {
        boolean tests = true;
        int[] dice = {3, 3, 3, 3, 3};
        DieValues die = new DieValues(dice);
        if (die.GetYatzeeScore() != 65) {
            System.out.println("test one failed");
            tests = false;
        }
        int[] dice2 = {1, 1, 2, 2, 3};
        die = new DieValues(dice2);
        if (die.GetYatzeeScore() != 9) {
            System.out.println("test two failed");
            tests = false;
        }
        int[] dice3 = {1, 3, 3, 3, 5};
        die = new DieValues(dice3);
        if (die.GetYatzeeScore() != 30) {
            System.out.println("test three failed");
            tests = false;
        }
        int[] dice4 = {2, 2, 2, 2, 4};
        die = new DieValues(dice4);
        if (die.GetYatzeeScore() != 24) {
            System.out.println("test four failed");
            tests = false;
        }
        int[] dice5 = {1, 1, 2, 3, 4};
        die = new DieValues(dice5);
        if (die.GetYatzeeScore() != 41) {
            System.out.println("test five failed");
            tests = false;
        }
        int[] dice6 = {1, 2, 3, 4, 5};
        die = new DieValues(dice6);
        if (die.GetYatzeeScore() != 55) {
            System.out.println("test six failed");
            tests = false;
        }
        int[] dice7 = {5, 5, 5, 5, 5};
        die = new DieValues(dice7);
        if (die.GetYatzeeScore() != 75) {
            System.out.println("test seven failed");
            tests = false;
        }

        if (!tests) {
            System.out.println("tests not passed");
        }

    }
    
    
}
