package class13HW;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true
Abbc =>false
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word");
        StringBuilder possiblePal= new StringBuilder(input.next());
        if(possiblePal.equals(possiblePal.reverse())){
            System.out.println("Word entered is a palindrome");
        }else {
            System.out.println("Word entered is not a palindrome");
        }

    }
}
