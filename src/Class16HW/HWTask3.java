package Class16HW;

public class HWTask3 {
    private String vowels(String str){
        String newStr=str.replaceAll("[^aeiou]","");
        return newStr;
    }

    public static void main(String[] args) {
       HWTask3 task3=new HWTask3();
        String str="Hello World";
        System.out.println(task3.vowels(str));

        





}
        }
