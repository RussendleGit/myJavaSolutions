
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ASCIIZoo art = new ASCIIZoo();
        System.out.println("you can draw a cat, bat, dog, deer, bird" +
        "spider, and an elephant.");
        System.out.print("I would like to draw a: ");
        String userAnimal = input.next();
        if (userAnimal.equals("cat")) {art.drawCat();}
        else if (userAnimal.equals("bat")) {art.drawBat();}
        else if (userAnimal.equals("dog")) {art.drawDog();}
        else if (userAnimal.equals("deer")) {art.drawDeer();}
        else if (userAnimal.equals("bird")) {art.drawBird();}
        else if (userAnimal.equals("spider")) {art.drawSpider();}
        else if (userAnimal.equals("elephant")) {art.drawElephant();}
        input.close();

    }
    
    
}
