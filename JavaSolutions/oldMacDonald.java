import java.util.*;

public class oldMacDonald {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your animal? ");
        String animal = input.next();
        System.out.println("What is animals sound? ");
        String sound = input.next();
        //got visual studio to work :D
        System.out.println("Old MacDonald had a farm");
        System.out.println("Ee i ee i oh");
        System.out.println("And on his farm he had a " + animal);
        System.out.println("Ee i ee i oh");
        System.out.println("With a " + sound + "-" + sound + " here");
        System.out.println("And a " + sound + "-" + sound + " There");
        System.out.println("Here a " + sound + ", there a" + sound);
        System.out.println("Everywhere a " + sound + "-" + sound);
    }
}
