package class12HW;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any word larger than 3 letters and containing an odd number of characters");
        String word= input.next();
        if(word.length()>3&&word.length()%2!=0){

                System.out.println(word.charAt(word.length()/2));

        }else{
            System.out.println("Your word does not meet the specified criteria");
        }
    }
}
