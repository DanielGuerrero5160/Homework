package class23HW;

public class Student {
      /*
    Create a Class Student that will have 3 subclasses as
    SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override
some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism

     */

    void study(){
        System.out.println("Student is studying");
    }
    void practice(){
        System.out.println("Practicing the skills");
    }

}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("SyntaxStudent is studying");
    }
}
class CollegeStudent extends Student{
    void study(){
        System.out.println("CollegeStudent is studying");
    }
    void thesis(){
        System.out.println("College student is working on their thesis");
    }
}
class SchoolStudent extends Student{
    void study(){
        System.out.println("SchoolStudent is studying");
    }
    void detention(){
        System.out.println("School Student is in detention");
    }
}
class tester{
    public static void main(String[] args) {
        Student [] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (Student student: students ) {
            student.study();//printing overridden method in each subclass of the array of type parent class
            student.practice();//calling a not overridden method for each object(subclass) of the array of parent type

        }
        System.out.println("******");
        SchoolStudent ss=new SchoolStudent();

        ss.detention();
    }
}
