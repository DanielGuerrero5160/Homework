package class15HW;

public class Task5 {

    boolean isPrime(int num) {
        boolean flag = true;
        if (num<=1){
            flag=false;
        }else if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }

        }
        return flag;
    }

    public static void main(String[] args) {
Task5 task5=new Task5();
        int num=11;
        System.out.println(num+" is prime? "+ task5.isPrime(num));

    }
}
