package class20HW;

public class Employee {

    /*
    Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that
should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add
some features and methods to the Tester Class.
Test your code!
     */

    String name;
    int age;
    String title;
    double salary;

    Employee(String name,int age,String title,double salary){
        this.name=name;
        this.age=age;
        this.title=title;
        this.salary=salary;
    }

    void displayInfo(){
        System.out.println("Name:"+name+"  age:"+age+"  Job Title:"+title+"  Salary:"+salary);
    }

    double bonus(double salary){
        this.salary=salary;
        System.out.print("Your bonus is $");
        return 2000;
    }
}
