package class23HW;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple(),new HP(),new Dell(),new Lenovo()};
        for(Computer x: computers){
            x.start();
            x.shutDown();
            System.out.println("----------------");
        }


    }
}
