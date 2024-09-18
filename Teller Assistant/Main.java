
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How much is the customer withdrawing? (up to $100): ");
        Double userInput = input.nextDouble();
        if (userInput <= 0) {
            Withdrawl myBalance = new Withdrawl();
        } else {
            Withdrawl myBalance = new Withdrawl(userInput);
        }
        
    }
}
