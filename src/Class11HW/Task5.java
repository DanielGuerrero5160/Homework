package Class11HW;

public class Task5 {
    /*
    Using 2D array create a grocery list.
Inside you should have an array of veggies,
fruits, dairy and sweets. Retrieve all
values from that array using 2 different loops
     */
    public static void main(String[] args) {
        String[][] groceryList={{"carrots","zuchini","potatoes"},
                {"apples","oranges","banannas"},
                {"milk","yogurt","cheese"},
                {"cookies","ice cream","chocolate"},
        };
        for(int i=0;i< groceryList.length;i++){
            for (int j = 0;j < groceryList[i].length ; j++) {
                System.out.print(groceryList[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("************");
        for(String[]arr:groceryList){
            for(String x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
