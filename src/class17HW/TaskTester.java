package class17HW;

public class TaskTester {

    public static void main(String[] args) {
        Task task1=new Task("Daniel","Guerrero",25);
        Task task2=new Task();
        task2.firstName="Daniel";
        task2.lastName="Guerrero";
        task2.age=25;

        task2.printInfo();
        task1.printInfo();
    }
}
