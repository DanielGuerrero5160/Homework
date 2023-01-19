package Class11HW;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="Apple";
        iphone.color="White";
        iphone.quality="High";
        iphone.call();
        iphone.text();

        Phone pixel=new Phone();
        pixel.brand="Google";
        pixel.color="black";
        pixel.quality="mid";
        pixel.call();
        pixel.text();

        Phone samsung=new Phone();
        samsung.brand="samsung";
        samsung.color="red";
        samsung.quality="mid";
        samsung.call();
        samsung.text();



    }
}
