package class22HW;

public class CreditCard {

    double balance;
    double interest=.04;

    void calcInterest(double balance){
        System.out.println(balance*interest);

    }
}
class Visa extends CreditCard{


}
class AX extends CreditCard{
    @Override
    void calcInterest(double balance){
        double interest=.03;
        System.out.println(balance*interest);

    }
}

class CCTester{
    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        cc.calcInterest(60000);

        Visa visa=new Visa();
        visa.calcInterest(60000);
        AX ax=new AX();
        ax.calcInterest(60000);


    }
}

