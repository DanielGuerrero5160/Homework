package class20HW;

public class FullTime extends Employee{



    int hours;
    String level;

    FullTime(String name,int age,String title,double salary,int hours,String level){
super(name,age,title,salary);
this.hours=hours;
this.level=level;
    }

    void displayFT(){
        System.out.println(name+"works "+hours+" a week and is a "+level+" employee");
    }

}
