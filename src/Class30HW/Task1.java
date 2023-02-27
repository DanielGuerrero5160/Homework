package Class30HW;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {


        Map<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(112334,"IPhone 13");
        bestBuy.put(122212334,"MacBook Air");
        bestBuy.put(116782334,"Refrigerator");
        bestBuy.put(1453412334,"Bose Speaker");
        bestBuy.put(1123357765,"Lenovo laptop");

        var entires=bestBuy.entrySet();
        for (Map.Entry e:entires) {
            System.out.println(e.getKey()+" ="+e.getValue());
        }


    }
}
