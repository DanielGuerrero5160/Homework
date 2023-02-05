package class19HW;

public class ChemistryTeacher extends Teacher {
    String favElement;

    void printFavElement(){
        System.out.println("My favorite element is "+favElement);
    }

    public static void main(String[] args) {
        ChemistryTeacher ct=new ChemistryTeacher();
        ct.name="Mr.Brown";
        ct.favElement="carbon";
        ct.subject="Chemistry";
        ct.yearsExperience=20;
        ct.printFavElement();
        ct.printInfo();
        ct.discipline();
        ct.practice();
        ct.printSubject();
    }
}
