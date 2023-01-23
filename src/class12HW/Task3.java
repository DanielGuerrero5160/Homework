package class12HW;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter moms name");
        String moms= input.next();
        System.out.println("Please enter dads name");
        String dads= input.next();
        System.out.println("Are you expecting a boy or a girl? Please enter B or G");
        String gender=input.next();
        if(gender.equals("B")){
            System.out.println(dads.substring(0,3)+moms.substring(moms.length()-2));
        }
        if (gender.equals("G")) {
            System.out.println(moms.substring(0,2)+dads.substring(dads.length()-3));
        }

    }
}
