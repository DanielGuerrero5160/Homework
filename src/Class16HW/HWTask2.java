package Class16HW;

public class HWTask2 {
    public String revStr(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        HWTask2 task2=new HWTask2();
        System.out.println(task2.revStr("Hello"));

    }
}
