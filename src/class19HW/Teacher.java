package class19HW;

public class Teacher {
    String name;
    String subject;
    int yearsExperience;

    void printInfo(){
        System.out.println("Name is:"+name+" Subject is:"+ subject+" Years of Experience:"+yearsExperience);
    }
    void discipline(){
        System.out.println("Sending you to detention");
    }
    void printSubject(){
        System.out.println("I am a "+subject+" teacher!");
    }
    void practice(){
        System.out.println("Here is some more homework to practice "+subject);
    }
}
