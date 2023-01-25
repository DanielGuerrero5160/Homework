package class13HW;

public class Task4 {
    public static void main(String[] args) {
String str="This is the sentence i want to reverse";
       String[] strSplit=str.split(" ");
       String reverseWord="";
       for (String x: strSplit){
           StringBuilder sb= new StringBuilder(x);
           sb.reverse();
           reverseWord+= sb.toString()+" ";
       }
        System.out.println(reverseWord);

    }
}
