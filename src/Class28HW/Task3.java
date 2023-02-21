package Class28HW;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.
         */
        ArrayList<String> words=new ArrayList<>();
        words.add("Hello");
        words.add("Goodbye");
        words.add("Date");
        words.add("Time");
        words.add("Week");
        words.add("Month");

        words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);
    }
}
