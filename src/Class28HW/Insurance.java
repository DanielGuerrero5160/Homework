package Class28HW;

import java.util.ArrayList;

public abstract class Insurance {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
    as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as
    carModel and Class Pet has petType attribute. Create 3 objects of the sub classes
    and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;

    abstract void getQuote();

    abstract void cancelInsurance();

    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

}
class Car extends Insurance{
    @Override
    void getQuote() {
        System.out.println("Here is your car insurance quote for your "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Your car insurance for your "+carModel+" has been cancelled");
    }

    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }
}
class Pet extends Insurance{
String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Here is your "+insuranceName+" quote for your "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Your "+insuranceName+" has been cancelled for your "+petType);
    }
}
class Health extends Insurance{
    @Override
    void getQuote() {
        System.out.println("Here is your "+insuranceName+" quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Your health insurance has been cancelled. ");
    }

    public Health(String insuranceName) {
        super(insuranceName);
    }

    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("car insurance","BMW"));
        insurances.add(new Health("Health Insurance"));
        insurances.add(new Pet("Pet Insurance","cat"));

        for(Insurance x:insurances){
            x.getQuote();
            x.cancelInsurance();
        }
        System.out.println("****************");
        for (int i = 0; i < insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();

        }
        System.out.println("*******************");

        insurances.forEach(x->x.getQuote());
        insurances.forEach(x-> x.cancelInsurance());

    }
}
