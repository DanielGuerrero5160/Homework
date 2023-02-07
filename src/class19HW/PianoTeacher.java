package class19HW;

public class PianoTeacher extends Teacher{
    String favStyle;

    void printFavStyle(){
        System.out.println("My favorite style of piano is "+favStyle);
    }

    public static void main(String[] args) {
        PianoTeacher pt=new PianoTeacher();
        pt.favStyle="Classical";
        pt.name="Mrs.Passion";
        pt.subject="Piano";
        pt.yearsExperience=2;
        pt.printFavStyle();
        pt.printInfo();
        pt.discipline();
        //pt.practice(); cannot use because this is a private method
        pt.printSubject();
    }
}
