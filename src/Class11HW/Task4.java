package Class11HW;

public class Task4 {
    public static void main(String[] args) {
        String[][] cars={{"Ford","Chevy"},
                                   {"Mercedes","BMW"},
                                     {"Hyundai","Kia"},
                                  {"Maserati","Ferrari"},
        };
        for (int i = 0; i <cars.length ; i++) {
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("************");
        for(String[] arr:cars) {
            for (String x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
