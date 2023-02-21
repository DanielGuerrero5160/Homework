package Class28HW;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Water");
        drinks.add("Beer");
        drinks.add("Juice");
        drinks.add("Milk");
        drinks.add("Coffee");
        drinks.add("Tea");



        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "Water");
            }


        }
        System.out.println(drinks);

    }
}






