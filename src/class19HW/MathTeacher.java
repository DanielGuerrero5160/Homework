package class19HW;

public class MathTeacher extends Teacher{
    String university;

    void printUni(){
        System.out.println("I went to "+university+" university");
    }

    public static void main(String[] args) {
        MathTeacher mt=new MathTeacher();
        mt.university="Penn State";
        mt.name="Julia";
        mt.subject="Math";
        mt.yearsExperience=7;
        mt.printInfo();
        mt.printUni();
        mt.printSubject();
        mt.discipline();
        mt.practice();

    }
}
