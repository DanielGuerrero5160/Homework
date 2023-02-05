package class19HW;

public class ClassC extends ClassB{

    public static void main(String[] args) {
        ClassC cC=new ClassC();
        cC.age=50;
        cC.name="Tony";
        cC.hometown="NYC";
        cC.hasPet=false;
        cC.printInfo();
        System.out.println(cC.hasPet);
    }
}
