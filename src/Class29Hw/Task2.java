package Class29Hw;

import java.util.LinkedHashSet;

public class Task2 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Sao Paulo");
        cities.add("Rio");
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("Anchorage");

        cities.removeIf(s->s.startsWith("A"));

        System.out.println(cities);




    }
}
