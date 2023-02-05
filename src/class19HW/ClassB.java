package class19HW;

public class ClassB extends ClassA {

boolean hasPet;


    public static void main(String[] args) {
ClassB cB=new ClassB();
cB.age=33;
cB.name="Jimmy";
cB.hometown="State College";
cB.hasPet=true;
cB.printInfo();
        System.out.print("Has Pet:"+cB.hasPet);
    }



}
