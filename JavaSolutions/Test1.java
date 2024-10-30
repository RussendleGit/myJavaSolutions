public class Test1{
    public static void main(String[] args){
        double gallonPrice = 2.35; //type of value isnt defined.
        int milesPerGallon = 40; //declared backwards
        double totalFunds = 8.0;
        double numGallons = (double) (totalFunds / gallonPrice); //no operator, and not casted
        double numMiles = numGallons * milesPerGallon;
        System.out.println(numMiles); //missing -> )
    }
}