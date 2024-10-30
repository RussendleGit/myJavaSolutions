import java.util.Scanner;
public class ShoppingTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pencils did you buy?");
        int pencilsBought = input.nextInt();
        System.out.println("How many lined paper sets did you buy?");
        int paperBought = input.nextInt();
        System.out.println("How many pens did you buy?");
        int pensBought = input.nextInt();
        System.out.println("How many notebooks did you buy?");
        int notebooksBought = input.nextInt();

        Shopping myList = new Shopping(pencilsBought, paperBought, pensBought, notebooksBought);
        System.out.print(myList);
    }
}
