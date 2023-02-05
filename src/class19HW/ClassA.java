package class19HW;

public class ClassA {
    String name;
    String hometown;
    int age;

    void printInfo(){
        System.out.println("Name is:"+name+" age:"+age+" Hometown:"+hometown);
    }

    public static void main(String[] args) {
        ClassA cA=new ClassA();
        cA.age=25;
        cA.name="Daniel";
        cA.hometown="State College";
        cA.printInfo();
    }

}
