package class9HW;

public class Task6 {
    public static void main(String[] args) {
      /*
      Create an array of countries.
      While retrieving all values from an array print capital for
      each country choose any five countries.
       */
        String[] countries={"USA","Spain","Mexico","Brazil","Morocco"};
        for(int i=0;i< countries.length;i++){
            switch(i){
                case 0:
                    System.out.println("The capital of "+countries[i]+" Is "+"WashingtonDC");
                    break;
                case 1:
                    System.out.println("The capital of "+countries[i]+" Is "+"Madrid");
                    break;
                case 2:
                    System.out.println("The capital of "+countries[i]+" Is "+"Mexico City");
                    break;
                case 3:
                    System.out.println("The capital of "+countries[i]+" Is "+"Sao Paulo");
                    break;
                case 4:
                    System.out.println("The capital of "+countries[i]+" Is "+"Rabat");
            }
        }



    }
}
