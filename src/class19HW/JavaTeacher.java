package class19HW;

public class JavaTeacher extends Teacher{

    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
        JavaTeacher jt=new JavaTeacher();
        jt.name="Asel";
        jt.subject="Java";
        jt.yearsExperience=12;
        jt.printInfo();//public method
        jt.discipline();//protected method
        jt.code();//default method - can only be used in same package
        //jt.practice(); cannot use as this is a private method

    }
}
