package class23HW;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    void start(){
        System.out.println("Computer is starting");
    }
    void shutDown(){
        System.out.println("Computer is shutting down");
    }
}
class Apple extends Computer{
    void start(){
        System.out.println("Apple computer is starting");
    }
    void shutDown(){
        System.out.println("Apple computer is shutting down");
    }

    void terminal(){
        System.out.println("Apple computers have terminal");
    }

}
class Lenovo extends Computer{
    void start(){
        System.out.println("Lenovo computer is starting");
    }
    void shutDown(){
        System.out.println("Lenovo computer is shutting down");
    }

}
class HP extends Computer{
    void start(){
        System.out.println("HP computer is starting");
    }
    void shutDown(){
        System.out.println("HP computer is shutting down");
    }

}
class Dell extends Computer {
    void start(){
        System.out.println("Dell computer is starting");
    }
    void shutDown(){
        System.out.println("Dell computer is shutting down");
    }
    void operatingSystem(){
        System.out.println("Dell computers use windows OS");
    }

}
