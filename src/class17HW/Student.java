package class17HW;

public class Student {
    /*
    Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;

    Student(String sName,String sAddress){
        name=sName;
        address=sAddress;
    }
    void displayInfo(){
        System.out.println("Student name is: "+name+" Student address is: "+address);
    }

    public static void main(String[] args) {
        Student student=new Student("Daniel","123 abc Street");
        student.displayInfo();
    }

}
