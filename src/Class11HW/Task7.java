package Class11HW;

public class Task7 {
    public static void main(String[] args) {
        int[][] nums={{111,221,41,23},
                {12,144,561,56},
                {121,781,531,788},
        };


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
               if(nums[i][j]%2==0){
                   System.out.println(nums[i][j]);
               }

            }

        }
    }
}
