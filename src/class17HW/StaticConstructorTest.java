package class17HW;

public class StaticConstructorTest {
    int year;
    double money;
    String name;

   //static -Unable to make static constructor
    StaticConstructorTest(int sYear,double sMoney,String sName){
        year=sYear;
        money=sMoney;
        name=sName;


    }
    void display(){
        System.out.println("Year: "+year+" money: "+money+" name: "+name);
    }

    public static void main(String[] args) {
        StaticConstructorTest st=new StaticConstructorTest();
        st.display();
    }
}
