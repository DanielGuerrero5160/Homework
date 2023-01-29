package Class16HW;

public class HWTask1 {
    int arrSum(int [] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        HWTask1 task1=new HWTask1();
        int[] arr={1,2,3,4,5};
        System.out.println(task1.arrSum(arr));
    }
}
