

class Lyrics {
    public static String ate(String a) {
        return "There was an old woman who swallowed a " + a;
    }
    public static String reason(String a, String b) {
        return "She swallowed the " + a + " to catch the " + b + ",";
    }
    final public static String[] animals = {"fly", "spider", "bird", "cat", "dog", "octopus"};
    final public static String ENDING = "I don't know why she swallowed that fly," + "\n" +
        "Perhaps she'll die.";
    final public static String LAST = "There was an old woman who swallowed a horse" + "\n" + "She died of course.";
    
    final public static String[] ANIMALVERSES = {"",
        "That wriggled and iggled and jiggled inside her.", 
        "How absurd to swallow a bird.", 
        "Imagine that to swallow a cat.",
        "What a hog to swallow a dog.",
        "How gross to swollow an octopus"};
    
    

    public static void main(String[] args) {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(ate(animals[i]));
            System.out.println(ANIMALVERSES[i]);
            for (int x = i; x > 0; x--) {
                System.out.println(reason(animals[x], animals[x - 1]));
            }
            System.out.println(ENDING);
            System.err.println("");
        }
        System.err.println(LAST);
    }
}
