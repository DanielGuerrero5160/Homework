package class13HW;

public class Task6 {
    public static void main(String[] args) {
        /*
        How would you swap
         2 strings without a temporary variable?
         */
        String str1="Hello";
        String str2="World";

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());//hello
str1=str1.substring(str2.length());

        System.out.println("str1 is now "+str1);
        System.out.println("str2 is now "+str2);

    }
}
