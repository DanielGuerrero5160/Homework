package Class28HW;

import java.util.ArrayList;

public class Task2 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
     */
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Mercedes");
        cars.add("Ferrari");
        cars.add("Honda");
        cars.add("Genesis");

        //1st way to retrieve
        System.out.println("First way***");
        System.out.println(cars);
        //second way to retrieve
        System.out.println("Second way***");
        for (String s:cars) {
            System.out.println(s+" ");
        }
        //third way to retrieve
        System.out.println("Third Way***");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }
    }
}
