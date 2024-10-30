public class Withdrawl {
    private Double balance;
    
    private int twenties; public final int TWENTIESVALUE = 20;
    private int tens;     public final int TENSVALUE = 10;
    private int fives;    public final int FIVESVALUE = 5;
    private int ones;     public final int ONESVALUE = 1;//too good for the two dollar bill
    private int quarters; public final Double QUARTERSVALUE = 0.25;
    private int dimes;    public final Double DIMESVALUE = 0.10;
    private int nickles;  public final Double NICKLESVALUE = 0.05;
    private int pennies;  public final Double PENNIESVALUE = 0.01;

    public Withdrawl(Double userBalance) {
        if (userBalance > 100){
            System.out.println("This is invalid but I wont stop you.");
        }
        balance = userBalance;
        this.calculate();
    }

    public Withdrawl() {
        balance = 99.99;
        System.out.println("Value not set. Setting it to: " + balance);
        this.calculate();
    }

    private void calculate() {
        // there is a more effective way to do this with a for loop but I dont want to spend that time rn lol
        Double tempBalance = balance;
        int floatBalance;

        twenties = (int) (tempBalance / TWENTIESVALUE);
        tempBalance = tempBalance - (TWENTIESVALUE * twenties);
        //System.out.println(tempBalance);

        tens = (int) (tempBalance / TENSVALUE);
        tempBalance = tempBalance - (TENSVALUE * tens);
        //System.out.println(tempBalance);

        fives = (int) (tempBalance / FIVESVALUE);
        tempBalance = tempBalance - (FIVESVALUE * fives);
        //System.out.println(tempBalance);

        ones = (int) (tempBalance / ONESVALUE);
        tempBalance = tempBalance - (ONESVALUE * ones);
        //System.out.println(tempBalance);

        tempBalance = Math.round(tempBalance * 100.0) / 100.0;
        floatBalance = (int) (tempBalance * 100);
        //System.out.println("whole" + tempBalance);

        quarters = (int) (floatBalance / (QUARTERSVALUE * 100));
        floatBalance = (int) (floatBalance - ((QUARTERSVALUE * 100) * quarters));
        tempBalance = tempBalance - (QUARTERSVALUE * quarters);
        //System.out.println(tempBalance);

        dimes = (int) (floatBalance / (DIMESVALUE * 100));
        floatBalance = (int) (floatBalance - ((DIMESVALUE * 100) * dimes));
        tempBalance = tempBalance - (DIMESVALUE * dimes);
        //System.out.println(tempBalance);

        nickles = (int) (floatBalance / (NICKLESVALUE * 100));
        floatBalance = (int) (floatBalance - ((NICKLESVALUE * 100) * nickles));
        tempBalance = tempBalance - (NICKLESVALUE * nickles);
        //System.out.println(tempBalance);

        pennies = (int) (floatBalance / (PENNIESVALUE * 100));
        floatBalance = (int) (floatBalance - ((PENNIESVALUE * 100) * pennies));
        tempBalance = tempBalance - (PENNIESVALUE * pennies);

        System.out.println("20 dollar bills: " + twenties);
        System.out.println("10 dollar bills: " + tens);
        System.out.println("5 dollar bills: " + fives);
        System.out.println("1 dollar bills: " + ones);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies: " + pennies);
        System.out.println();

        //System.out.println(floatBalance);
        //System.out.println(tempBalance);
    }

    public Double getBalance() {return balance;}
    public int getTwenties() {return twenties;}
    public int getTens() {return tens;}
    public int getFives() {return fives;}
    public int getOnes() {return ones;}
    public int getQuarters() {return quarters;}
    public int getDimes() {return dimes;}
    public int getNickles() {return nickles;}
    public int getPennies() {return pennies;}

    public void setBalance(Double userBalance) {
        balance = userBalance;
        this.calculate();
    }

    

    
    
    
    
    
    
    

    

}
