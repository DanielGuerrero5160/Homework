package class17HW;

public class Skateboard {
    /*
    Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.
     */

    String brandDeck;
    String brandWheels;
    String brandTrux;

    double size;

   public Skateboard(String sBrandDeck,String sBrandWheels,String sBrandTrux,double sSize){
        brandDeck=sBrandDeck;
        brandWheels=sBrandWheels;
        brandTrux=sBrandTrux;
        size=sSize;
    }
    private Skateboard(String sBrandDeck,String sBrandWheels,String sBrandTrux) {
        brandDeck = sBrandDeck;
        brandWheels = sBrandWheels;
        brandTrux = sBrandTrux;
    }

     Skateboard(String sBrandDeck,String sBrandWheels) {
        brandDeck = sBrandDeck;
        brandWheels = sBrandWheels;

    }

   protected Skateboard(String sBrandDeck) {
        brandDeck = sBrandDeck;

    }
   public void printSkateboard(){
        System.out.println("Deck Brand: "+brandDeck+" Wheel Brand: "+brandWheels+" Trux Brand: "+brandTrux+"size: "+size);
    }

    public static void main(String[] args) {
        Skateboard skateboard=new Skateboard("Real","ricta","tensor");
        skateboard.printSkateboard();
    }

}
