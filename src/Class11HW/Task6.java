package Class11HW;

public class Task6 {
    public static void main(String[] args) {
        int[][] nums={{111,221,41},
                {12,144,561},
                {121,781,531},

        };
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
               sum+=nums[i][j];
            }

        }
        System.out.println(sum);
    }
}
