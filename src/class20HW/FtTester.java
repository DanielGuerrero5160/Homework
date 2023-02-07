package class20HW;

public class FtTester {


    public static void main(String[] args) {

        FullTime ft=new FullTime("James",25,"QA Engineer",100000,40,"Mid-Level");
        ft.displayInfo();
        ft.displayFT();
        System.out.println(ft.bonus(ft.salary));
        


    }
}
