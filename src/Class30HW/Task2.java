package Class30HW;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task2 {


        /*
     Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
         */


}
class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void printDetails(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class PersonTester{

    public static void main(String[] args) {

        Person p1=new Person("Daniel","Guerrero",25,80000);
        Person p2=new Person("Jimmy","Steff",28,85000);
        Person p3=new Person("Josh","Frame",30,60000);
        Person p4=new Person("Joe","Shmo",66,800000);


        Map<Integer,Person> people=new TreeMap<>();
        people.put(123,p1);
        people.put(124,p2);
        people.put(125,p3);
        people.put(126,p4);

   var entries=people.entrySet();
        for (Map.Entry<Integer,Person> e:entries) {
            System.out.println(e.getKey());
            e.getValue().printDetails();

        }


    }
}
