package class15HW;

public class Task2 {
    /*
    Create a method that will take a number
    and prints whether the number is even or odd
     */
    String evenOdd(int num){
        if (num%2==0){
            return num+" is Even";
        }else {
            return num+" is odd";
        }
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        System.out.println(task2.evenOdd(6));
    }
}
