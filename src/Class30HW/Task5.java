package Class30HW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class Task5 {
    /*
    Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        Collection<Integer> nums=new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(1);
        nums.add(7);

        int sum=0;
        for(Integer i:nums){
            sum+=i;
        }
        System.out.println(sum);
    }
}
