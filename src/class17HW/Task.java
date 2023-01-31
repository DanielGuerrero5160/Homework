package class17HW;

public class Task {
    int age;
    String firstName;
    String lastName;

    Task(String tfirstName,String tLastName,int tAge){
        age=tAge;
        firstName=tfirstName;
        lastName=tLastName;
    }
    Task(){

    }
    /*
    Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    void printInfo(){
        System.out.println(firstName+" "+lastName+" "+age);
    }
}
