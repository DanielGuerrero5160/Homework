package Class11HW;

public class Task8 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries:
        north america countries, south america countries,
        europe countries, asian countries, african countries. Then print all values from that array using 2 different loops and
        calculate how many total countries been stored
         */

        String[][] countries={{"Canada","USA","Mexico"},
                {"Brazil","Argentina","Colombia"},
                {"Spain","Germany","France"},
                {"China","Japan","Croatia"},
                {"Morocco","Nigeria","Kenya"},
        };
        int sumCountries=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                sumCountries++;
            }
            System.out.println();
        }
        System.out.println(sumCountries);
        System.out.println("***********");
        int sumCountries2=0;
        for(String[] arr:countries){
            for(String x:arr){
                System.out.print(x+" ");
                sumCountries2++;
            }
            System.out.println();


        }
        System.out.println(sumCountries2);
    }
}
