package class13HW;

public class Task2 {
    public static void main(String[] args) {
        String str="a12d$%d$%gzbL&%^G";

       String alphaNumeric=str.replaceAll("[^a-zA-Z1-9]","");
      int alphaNumericLength=alphaNumeric.length();

        System.out.println("The total quantity of alphanumeric characters in the string is "+ alphaNumericLength);










    }
}
