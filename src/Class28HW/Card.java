package Class28HW;

import java.util.LinkedList;

public class Card {
    /*
    Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
     */

    double interestRate;
    String cardType;

    Card(double interestRate, String cardType){
        this.interestRate=interestRate;
        this.cardType=cardType;
    }

    public void displayInfo(){
        System.out.println(cardType+" has an interest rate of "+interestRate);
    }
    public void displayFeatures(){
        System.out.println(cardType+" gives you air miles and cash back");
    }

    public static void main(String[] args) {
        Card card=new Card(12.0,"Discover");
        Card card1=new Card(15,"Amex");
        Card card2=new Card(19.27,"Visa");
        LinkedList<Card> cards=new LinkedList<>();
       cards.add(card);
       cards.add(card1);
       cards.add(card2);

       for(Card c:cards){
           c.displayInfo();
           c.displayFeatures();
       }
        System.out.println("*********");
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).displayInfo();
            cards.get(i).displayFeatures();
        }
        System.out.println("************");
        cards.forEach(c->c.displayInfo());
        cards.forEach(c->c.displayFeatures());



    }
}
