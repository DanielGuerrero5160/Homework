package Class30HW;

import java.util.*;

public class Task3 {
    /*
    Create a Map that will store Employee name and salary.
     Write a logic to retrieve an employee who gets the highest salary.
     Output should be in the below format
John Smith=$100000

     */
    public static void main(String[] args) {

        HashMap<String, Integer> Employee = new HashMap<>();

        Employee.put("Daniel", 80000);
        Employee.put("John Smith", 100000);
        Employee.put("Julia", 70000);
        Employee.put("Jimmy", 25000);

var entries=Employee.entrySet();
Map.Entry<String,Integer> max=null;
for (Map.Entry<String,Integer> e:entries){
    if(max==null||e.getValue()>max.getValue()){
        max=e;
    }
}
        System.out.println(max.getKey()+"=$"+max.getValue());
    }
}

/*
var entries = Employee.entrySet();
        Map.Entry<String,Integer> max=null;
        for (Map.Entry<String,Integer> e : entries) {
           if(e.getValue()>max.getValue()){
               max=e;
           }
        }

        System.out.println(max);
 */





