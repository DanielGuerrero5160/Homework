package class15HW;

public class Task3 {

    Boolean palindrome(String str){
       StringBuilder sb=new StringBuilder(str);
       if (str.equals(sb.reverse().toString())){
           return true;
       }else{
           return false;
       }
    }

    public static void main(String[] args) {

        Task3 task3=new Task3();
        String entry="hannah";
        System.out.println(entry+" is a palindrome? "+task3.palindrome(entry));
    }
}
