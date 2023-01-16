package class9HW;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create an array of size 5 on
        integers and calculate
        the sum of all elements in an array.
         */
        int[] nums= new int[5];
        nums[0]=3;
        nums[1]=70;
        nums[2]=222;
        nums[3]=5;
        nums[4]=9;
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }

}
